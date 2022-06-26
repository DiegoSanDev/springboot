package br.com.sandev.integracao.cadastro.cliente.domain.port;

import br.com.sandev.integracao.cadastro.cliente.domain.models.Client;

public interface ClienteRegisterRepository {

	Client save(Client client);

}
