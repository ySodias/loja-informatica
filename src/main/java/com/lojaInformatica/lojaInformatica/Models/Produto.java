package com.lojaInformatica.lojaInformatica.Models;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	@Getter
	@Setter
	private String nome;
	
	@NotNull
	@Getter
	@Setter
	private BigDecimal preco;
	//private DecimalFormat preco;
	
	@NotNull
	@Size(min = 5, max = 500)
	@Getter
	@Setter
	private String descricao;
	
	@NotNull
	@Size(min = 5, max = 15)
	@Getter
	@Setter
	private String validade;
	
	/*@ManyToOne
	@JsonIgnoreProperties("tb_produto")
	@Getter
	@Setter
	private Categoria tb_categoria;*/
}
