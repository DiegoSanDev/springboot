package br.com.sandev.cadastro.cliente.domain.models;

import java.io.Serializable;

import br.com.sandev.cadastro.cliente.domain.enums.StateType;
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
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @EqualsAndHashCode.Include
	private Long id;
	private String cep;
	private StateType stateType;
	private String city;
	private String streatt;
	private String number;
	private String complement;

}
