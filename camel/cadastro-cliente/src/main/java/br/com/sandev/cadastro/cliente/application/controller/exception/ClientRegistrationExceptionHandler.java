package br.com.sandev.cadastro.cliente.application.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.sandev.cadastro.cliente.application.controller.representation.ErrorMessage;

@ControllerAdvice
public class ClientRegistrationExceptionHandler {

	@ExceptionHandler({ FieldsRequiredException.class })
	public ResponseEntity<ErrorMessage> fieldsRequiredException(FieldsRequiredException fieldsRequiredException) {
		return ResponseEntity.badRequest().body(fieldsRequiredException.getErrorMessage());
	}

}
