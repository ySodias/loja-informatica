package com.lojaInformatica.lojaInformatica.Models;

import javax.persistence.Column;
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
	@Column(unique = true)
	private String email;	
	
	@Getter
	@Setter
	@NotNull
	@Column(unique = true)
	@Pattern(regexp = "^((\\d{3}).(\\d{3}).(\\d{3})-(\\d{2}|X|x))*$")
	private String cpf;
	
	@Getter
	@Setter
	@NotNull
	private Integer idade;
}
