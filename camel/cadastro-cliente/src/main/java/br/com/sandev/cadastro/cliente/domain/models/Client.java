package br.com.sandev.cadastro.cliente.domain.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @EqualsAndHashCode.Include
	private Long id;
	private String name;
	private String document;
	private String rg;
	private LocalDate birthDate;
	private String email;
	private Address address;
	private List<Phone> phones;

}
