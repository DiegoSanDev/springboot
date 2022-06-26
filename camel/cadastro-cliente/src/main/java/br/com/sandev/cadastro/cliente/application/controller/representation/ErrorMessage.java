package br.com.sandev.cadastro.cliente.application.controller.representation;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private int code;
	private String error;
	private String details;

}
