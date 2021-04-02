package com.lojaInformatica.lojaInformatica.Repository;

import org.springframework.stereotype.Repository;
import com.lojaInformatica.lojaInformatica.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

	@Query(value="SELECT * FROM tb_usuario WHERE tb_usuario.nome = :nome", nativeQuery = true)
	public List<Usuario>findUsuario(@Param("nome") String nome);
	
	@Query(value="SELECT * FROM tb_usuario WHERE tb_usuario.email LIKE CONCAT('%',:email,'%')", nativeQuery = true)
	public List<Usuario>findUsuarioEmail(@Param("email") String email);
	
	@Query(value="SELECT * FROM tb_usuario WHERE tb_usuario.idade = :idade", nativeQuery = true)
	public List<Usuario>findUsuarioIdade(@Param("idade") Integer idade);
}
