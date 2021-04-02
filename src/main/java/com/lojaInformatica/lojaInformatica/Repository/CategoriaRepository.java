package com.lojaInformatica.lojaInformatica.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lojaInformatica.lojaInformatica.Models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
	@Query(value="SELECT * FROM tb_categoria WHERE tb_categoria.nome= :nome", nativeQuery = true)
	public List<Categoria>findByCategoria(@Param("nome")String nome);
	
	@Query(value="SELECT * FROM tb_categoria WHERE tb_categoria.connectividade = :connectividade", nativeQuery = true)
	public List<Categoria>findByCategoriaConnectividade(@Param("connectividade")String connectividade);
	
	@Query(value="SELECT * FROM tb_categoria WHERE tb_categoria.games = :games", nativeQuery = true)
	public List<Categoria>findByCategoriaGames(@Param("games")String games);

	@Query(value="SELECT * FROM tb_categoria WHERE tb_categoria.energia = :energia", nativeQuery = true)
	public List<Categoria>findByCategoriaEnergia(@Param("energia")String energia);
	
	@Query(value="SELECT * FROM tb_categoria WHERE tb_categoria.telephonia = :telephonia", nativeQuery = true)
	public List<Categoria>findByCategoriaTelephonia(@Param("telephonia")String telephonia);
	
}
