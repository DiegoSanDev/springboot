package br.com.sandev.integracao.cadastro.cliente.domain.service;

import br.com.sandev.integracao.cadastro.cliente.domain.camel.CamelContextInitialize;
import br.com.sandev.integracao.cadastro.cliente.domain.models.Client;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientService {

	private final CamelContextInitialize camelContextRoutes;

	public Client save(Client client) {
		return this.camelContextRoutes.getProducerTemplate().requestBody("", client, Client.class);
	}

}
