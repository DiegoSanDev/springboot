package br.com.sandev.cadastro.cliente.domain.service;

import br.com.sandev.cadastro.cliente.domain.models.Client;
import br.com.sandev.cadastro.cliente.domain.port.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class ClientService {

	private final ClientRepository clientRepository;

	public Client save(Client client) {

		Client clientSave = Client.builder().build();

		try {

			clientSave = clientRepository.save(client);

		} catch (Exception e) {
			log.error("Error in save client", e);
			throw e;
		}

		return clientSave;

	}

}
