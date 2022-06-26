package br.com.sandev.cadastro.cliente.application.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Client> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Optional<Client>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
