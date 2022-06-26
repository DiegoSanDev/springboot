package br.com.sandev.integracao.cadastro.cliente.application.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import br.com.sandev.integracao.cadastro.cliente.domain.camel.CamelContextInitialize;
import br.com.sandev.integracao.cadastro.cliente.domain.camel.router.ClientRouter;
import br.com.sandev.integracao.cadastro.cliente.domain.port.ClienteRegisterRepository;
import br.com.sandev.integracao.cadastro.cliente.domain.service.ClientService;

@Configuration
public class Config {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CamelContextInitialize camelContextInitialize(RouteBuilder... routes) throws Exception {
		return new CamelContextInitialize(routes);
	}

	@Bean
	public ClientRouter clientRouter(ClienteRegisterRepository clienteRegisterRepository) {
		return new ClientRouter(clienteRegisterRepository);
	}

	@Bean
	public ClientService clientService(CamelContextInitialize camelContextInitialize) {
		return new ClientService(camelContextInitialize);
	}

}
