package br.com.sandev.integracao.cadastro.cliente.domain.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	private String document;
	private String rg;
	private LocalDate birthDate;

}
