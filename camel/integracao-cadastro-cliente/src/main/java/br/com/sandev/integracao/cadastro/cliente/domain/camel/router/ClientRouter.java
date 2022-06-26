package br.com.sandev.integracao.cadastro.cliente.domain.camel.router;

import org.apache.camel.builder.RouteBuilder;

import br.com.sandev.integracao.cadastro.cliente.domain.port.ClienteRegisterRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientRouter extends RouteBuilder {

	public static final String CLIENT_REGISTER_ROTER = "direct:clientRegisterFlow";

	private final ClienteRegisterRepository clienteRegisterRepository;

	@Override
	public void configure() throws Exception {

		from(CLIENT_REGISTER_ROTER)
			.bean(clienteRegisterRepository, "save")
		.end();

	}

}
