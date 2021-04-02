package com.lojaInformatica.lojaInformatica.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.lojaInformatica.lojaInformatica.Models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query(value = "SELECT * FROM tb_produto WHERE tb_produto.preco = :preco > 50")
	public List<Produto> findAllByPreco();
	
	@Query(value = "SELECT * FROM tb_produto WHERE tb_produto.preco = :preco > 3 AND < 60")
	public List<Produto> findByPreco();
	
	@Query(value = "SELECT * FROM tb_produto WHERE tb_produto.nome = :nome LIKE CONCAT('%',:b,'%')", nativeQuery = true)
	public List<Produto> findByNome(@Param("nome")String nome);
		
}
