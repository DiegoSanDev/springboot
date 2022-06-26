package br.com.sandev.cadastro.cliente.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.sandev.cadastro.cliente.domain.port.ClientRepository;
import br.com.sandev.cadastro.cliente.domain.service.ClientService;

@Configuration
public class Config {

	@Bean
	public ClientService clientService(ClientRepository clientRepository) {
		return new ClientService(clientRepository);
	}

}
