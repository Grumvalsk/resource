package com.grumvalsky.resource_server.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsitoBaseDTO {

    private HttpStatus status;
    private String descrizione;

}
