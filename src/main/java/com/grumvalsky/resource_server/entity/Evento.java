package com.grumvalsky.resource_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Evento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Evento {

    @Id
    private String id;
    private String titolo;
    private String descrizione;
    private String email;
}
