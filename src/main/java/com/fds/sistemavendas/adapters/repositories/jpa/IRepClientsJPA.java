package com.fds.sistemavendas.adapters.repositories.jpa;

import org.springframework.data.repository.CrudRepository;

import com.fds.sistemavendas.domain.entities.Client;

import java.util.List;
import java.util.Optional;

public interface IRepClientsJPA extends CrudRepository<Client, Long> {

    @Override
    Optional<Client> findById(Long id);
}
