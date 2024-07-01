package com.grumvalsky.resource_server.mapper;

import com.grumvalsky.resource_server.dto.EventoDTO;
import com.grumvalsky.resource_server.entity.Evento;
import org.springframework.stereotype.Component;

@Component
public class EventoMapper {

    public EventoDTO toDTO(Evento evento){
        return EventoDTO.builder()
                .titolo(evento.getTitolo())
                .descrizione(evento.getDescrizione())
                .email(evento.getEmail())
                .build();
    }

    public Evento toEntity(EventoDTO eventoDTO){
        return Evento.builder()
                .titolo(eventoDTO.getTitolo())
                .descrizione(eventoDTO.getDescrizione())
                .email(eventoDTO.getEmail())
                .build();
    }
}
