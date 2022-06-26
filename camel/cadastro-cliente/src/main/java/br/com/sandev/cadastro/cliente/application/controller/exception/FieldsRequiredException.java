package br.com.sandev.cadastro.cliente.application.controller.exception;

import java.io.Serializable;

import br.com.sandev.cadastro.cliente.application.controller.representation.ErrorMessage;
import lombok.Getter;

@Getter
public class FieldsRequiredException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1L;

	private final ErrorMessage errorMessage;

	public FieldsRequiredException() {
		super();
		errorMessage = null;
	}

	public FieldsRequiredException(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

}
