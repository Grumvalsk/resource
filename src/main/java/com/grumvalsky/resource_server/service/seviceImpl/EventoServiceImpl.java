package com.grumvalsky.resource_server.service.seviceImpl;

import com.grumvalsky.resource_server.dto.EsitoBaseDTO;
import com.grumvalsky.resource_server.dto.EventoDTO;
import com.grumvalsky.resource_server.entity.Evento;
import com.grumvalsky.resource_server.mapper.EventoMapper;
import com.grumvalsky.resource_server.repository.EventoRepository;
import com.grumvalsky.resource_server.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoMapper eventoMapper;

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public EsitoBaseDTO inserisci(EventoDTO eventoDTO) throws Exception {
        Evento evento=eventoMapper.toEntity(eventoDTO);
        eventoRepository.save(evento);
        return new EsitoBaseDTO( HttpStatus.CREATED,"Evento inserito");
    }

    @Override
    public List<EventoDTO> getListaByEmail(String email) {
        List<Evento>listaEventi=eventoRepository.getEventiByEmail(email);
        return listaEventi.stream().map(eventoMapper::toDTO).collect(Collectors.toList());
    }
}
