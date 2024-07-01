package com.grumvalsky.resource_server.service;

import com.grumvalsky.resource_server.dto.EsitoBaseDTO;
import com.grumvalsky.resource_server.dto.EventoDTO;

import java.util.List;

public interface EventoService {


    EsitoBaseDTO inserisci(EventoDTO eventoDTO) throws Exception;

    List<EventoDTO> getListaByEmail(String email);
}
