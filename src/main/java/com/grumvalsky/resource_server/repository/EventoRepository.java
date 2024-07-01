package com.grumvalsky.resource_server.repository;

import com.grumvalsky.resource_server.entity.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventoRepository extends MongoRepository<Evento, Long> {

    List<Evento> getEventiByEmail(String email);
}
