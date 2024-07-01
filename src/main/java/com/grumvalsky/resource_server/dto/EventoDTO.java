package com.grumvalsky.resource_server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class EventoDTO {

    private String titolo;
    private String descrizione;
    private String email;
}
