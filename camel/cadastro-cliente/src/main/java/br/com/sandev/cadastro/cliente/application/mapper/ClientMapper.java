package br.com.sandev.cadastro.cliente.application.mapper;

import org.springframework.beans.BeanUtils;

import br.com.sandev.cadastro.cliente.application.controller.representation.ClientRepresentation;
import br.com.sandev.cadastro.cliente.application.infrastructure.persistence.entity.ClientEntity;
import br.com.sandev.cadastro.cliente.domain.models.Client;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientMapper {

	public ClientEntity toEntity(Client client) {
		var clientEntity = ClientEntity.builder().build();
		BeanUtils.copyProperties(client, clientEntity);
		return clientEntity;
	}

	public Client entityToDomain(ClientEntity clientEntity) {
		var client = Client.builder().build();
		BeanUtils.copyProperties(clientEntity, client);
		return client;
	}

	public Client representationToDomain(ClientRepresentation representation) {
		var client = Client.builder().build();
		BeanUtils.copyProperties(representation, client);
		return client;
	}

	public ClientRepresentation domainToRepresentation(Client client) {
		ClientRepresentation representation = ClientRepresentation.builder().build();
		BeanUtils.copyProperties(client, representation);
		return representation;
	}

}
