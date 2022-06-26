package br.com.sandev.cadastro.cliente.application.controller.validator;

import static java.util.Objects.isNull;

import br.com.sandev.cadastro.cliente.application.controller.exception.FieldsRequiredException;
import br.com.sandev.cadastro.cliente.application.controller.representation.ClientRepresentation;
import br.com.sandev.cadastro.cliente.application.controller.representation.ErrorMessage;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientRepresentationValidator {

	private static final int CODE_FIELD_REQUIRED = 100;
	private static final String FIELD_REQUIRED = "Field  Required";
	private static final String DETAIL_NAME_REQUIRED = "Name field is Required";
	private static final String DETAIL_EMAIL_REQUIRED = "Emial field is Required";
	private static final String DETAIL_DOCUMENT_REQUIRED = "Document field is Required";

	public void validateFieldsRequired(ClientRepresentation representation) {
		validateName(representation.getName());
		validateEmail(representation.getEmail());
		validateDocument(representation.getDocument());
	}

	private void validateName(String name) {
		if (nonFieldValid(name)) {
			createFieldsRequiredException(DETAIL_NAME_REQUIRED);
		}
	}

	private void validateEmail(String email) {
		if (nonFieldValid(email)) {
			createFieldsRequiredException(DETAIL_EMAIL_REQUIRED);
		}
	}

	private void validateDocument(String document) {
		if (nonFieldValid(document)) {
			createFieldsRequiredException(DETAIL_DOCUMENT_REQUIRED);
		}
	}

	private boolean nonFieldValid(String field) {
		return isNull(field) || field.isBlank();
	}

	private ErrorMessage createErrorMessage(String error, String detail, int code) {
		return ErrorMessage.builder().code(code).details(detail).error(error).build();
	}

	private void createFieldsRequiredException(String detail) {
		throw new FieldsRequiredException(createErrorMessage(FIELD_REQUIRED, detail, CODE_FIELD_REQUIRED));
	}

}
