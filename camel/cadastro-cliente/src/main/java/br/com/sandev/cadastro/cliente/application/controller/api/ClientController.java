package br.com.sandev.cadastro.cliente.application.controller.api;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.sandev.cadastro.cliente.application.controller.representation.ClientRepresentation;
import static br.com.sandev.cadastro.cliente.application.controller.validator.ClientRepresentationValidator.validateFieldsRequired;
import br.com.sandev.cadastro.cliente.application.mapper.ClientMapper;
import br.com.sandev.cadastro.cliente.domain.service.ClientService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/clients")
public class ClientController {

	private final ClientService clientService;

	@PostMapping
	public ResponseEntity<ClientRepresentation> save(@RequestBody ClientRepresentation clientRepresentation) {
		
		validateFieldsRequired(clientRepresentation);
		var client = clientService.save(ClientMapper.representationToDomain(clientRepresentation));
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(client.getId()).toUri();
		
		return ResponseEntity.created(uri).body(ClientMapper.domainToRepresentation(client));
	}

}
