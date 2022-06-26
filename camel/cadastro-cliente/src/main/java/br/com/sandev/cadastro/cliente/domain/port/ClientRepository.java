package br.com.sandev.cadastro.cliente.domain.port;

import java.util.List;
import java.util.Optional;

import br.com.sandev.cadastro.cliente.domain.models.Client;

public interface ClientRepository {

	Client save(Client client);

	Optional<Client> getById(Long id);

	List<Optional<Client>> getAll();

}
