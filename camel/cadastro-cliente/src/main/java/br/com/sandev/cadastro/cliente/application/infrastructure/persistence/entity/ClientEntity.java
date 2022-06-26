package br.com.sandev.cadastro.cliente.application.infrastructure.persistence.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "client")
public class ClientEntity {

	@Id
	@Column
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "document", nullable = false, length = 14)
	private String document;

	@Column(name = "rg", nullable = true, length = 10)
	private String rg;

	@Column(columnDefinition = "DATE", nullable = true)
	private LocalDate birthDate;

	@Column(name = "emial", nullable = true, length = 100)
	private String email;

}
