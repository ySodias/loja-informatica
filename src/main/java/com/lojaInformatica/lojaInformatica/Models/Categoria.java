package com.lojaInformatica.lojaInformatica.Models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_produto")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;
	
	@NotNull
	@Size(min = 5 , max = 100)
	@Getter
	@Setter
	private String nome;
	

	@NotNull
	@Size(min = 5 , max = 100)
	@Getter
	@Setter
	private String connectividade;
	
	
	@NotNull
	@Size(min = 5 , max = 100)
	@Getter
	@Setter
	private String games;
	
	@NotNull
	@Size(min = 5 , max = 100)
	@Getter
	@Setter
	private String energia;
	
	@NotNull
	@Size(min = 5 , max = 100)
	@Getter
	@Setter
	private String telephonia;
	
	/*@Getter
	@Setter
	@OneToMany(mappedBy="tb_produto")
	@JsonIgnoreProperties("categoria")
    private List<Produto> produto;
	*/
	
	
}
