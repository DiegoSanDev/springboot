package br.com.sandev.integracao.cadastro.cliente.domain.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelContextInitialize {

	private final CamelContext context;

	public CamelContextInitialize(RouteBuilder... routes) throws Exception {
		this.context = new DefaultCamelContext();
		addRoutes(routes);
		this.context.start();
	}

	private void addRoutes(RouteBuilder... routes) throws Exception {
		for (RouteBuilder route : routes) {
			this.context.addRoutes(route);
		}
	}

	public ProducerTemplate getProducerTemplate() {
		return this.context.createProducerTemplate();
	}

}
