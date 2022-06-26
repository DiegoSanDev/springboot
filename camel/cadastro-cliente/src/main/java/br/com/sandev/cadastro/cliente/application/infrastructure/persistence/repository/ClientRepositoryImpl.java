package br.com.sandev.cadastro.cliente.application.infrastructure.persistence.repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.sandev.cadastro.cliente.application.infrastructure.persistence.entity.ClientEntity;
import br.com.sandev.cadastro.cliente.application.mapper.ClientMapper;
import br.com.sandev.cadastro.cliente.domain.models.Client;
import br.com.sandev.cadastro.cliente.domain.port.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class ClientRepositoryImpl implements ClientRepository {

	private final ClientEntityRepository repository;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Client save(Client client) {

		var clientEntity = ClientEntity.builder().build();

		try {
			clientEntity = repository.save(ClientMapper.toEntity(client));
		} catch (Exception e) {
			log.error("Error in save client.", e);
			throw e;
		}

		return ClientMapper.entityToDomain(clientEntity);
	}

	@Override
	public Optional<Client> getById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Optional<Client>> getAll() {
		return Collections.emptyList();
	}

}
