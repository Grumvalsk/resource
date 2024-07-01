package com.grumvalsky.resource_server.controller;

import com.grumvalsky.resource_server.dto.EsitoBaseDTO;
import com.grumvalsky.resource_server.dto.EventoDTO;
import com.grumvalsky.resource_server.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @RequestMapping(value = "/crea", method = RequestMethod.POST)
    public ResponseEntity<EsitoBaseDTO> inserisciEvento(@RequestBody EventoDTO eventoDTO) throws Exception {
         EsitoBaseDTO esitoBaseDTO=eventoService.inserisci(eventoDTO);
        return new ResponseEntity<>(esitoBaseDTO,  HttpStatus.CREATED);
    }

    @RequestMapping(value = "/lista/{email}", method = RequestMethod.GET)
    public ResponseEntity<List<EventoDTO>> ricercaLista(@PathVariable String email) throws Exception {
        List<EventoDTO> lista=eventoService.getListaByEmail(email);
        return new ResponseEntity<>(lista,  HttpStatus.CREATED);
    }
}
