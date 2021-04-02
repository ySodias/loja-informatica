package com.lojaInformatica.lojaInformatica.Models;

import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;
	
	@Getter
	@Setter
	@NotNull
	private String nome;
	
	@Getter
	@Setter
	@Email
	@NotNull
	private String email;	
	
	@Getter
	@Setter
	@NotNull
	@Pattern(regexp = "(^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$)")
	private String cpf;
	
	@Getter
	@Setter
	@NotNull
	private Integer idade;
}
