package br.com.sandev.cadastro.cliente.application.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandev.cadastro.cliente.application.infrastructure.persistence.entity.ClientEntity;

public interface ClientEntityRepository extends JpaRepository<ClientEntity, Long> { }
