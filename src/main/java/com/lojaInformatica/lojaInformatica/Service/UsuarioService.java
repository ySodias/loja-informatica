package com.lojaInformatica.lojaInformatica.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lojaInformatica.lojaInformatica.Repository.UsuarioRepository;
import com.lojaInformatica.lojaInformatica.Models.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositoryUsuario;
	
	
	public ResponseEntity <List<Usuario>> getUsuarioForNome(String nome)
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(repositoryUsuario.findUsuario(nome));
	}
	
	public ResponseEntity <List<Usuario>> getUsuarioForEmail(String email)
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(repositoryUsuario.findUsuarioEmail(email));
	}
	
	public ResponseEntity <List<Usuario>> getUsuarioForIdade(Integer idade)
	{
		if (idade > 18) {
			return ResponseEntity.status(HttpStatus.FOUND).body(repositoryUsuario.findUsuarioIdade(idade));
		}else {
			return null;
		}
	}	
}
