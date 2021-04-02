package com.lojaInformatica.lojaInformatica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaInformatica.lojaInformatica.Models.Usuario;
import com.lojaInformatica.lojaInformatica.Repository.UsuarioRepository;
import com.lojaInformatica.lojaInformatica.Service.UsuarioService;

@RestController
@RequestMapping("api/v1/lojainfomartica/usuario")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	UsuarioService serviceUsuario;
	
	@Autowired
	UsuarioRepository repositoryUsuario;
	
	@GetMapping("id")
	public ResponseEntity<List<Usuario>> pegarIdUsuario(){
		return ResponseEntity.ok(repositoryUsuario.findAll());
	}
	@GetMapping("id/{id}")
	public ResponseEntity<Usuario> pegarIdPorUsuario(@PathVariable Long id){
			return repositoryUsuario.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("nome/{nome}")
	public ResponseEntity<List<Usuario>> pegarUsuarioForNome(@PathVariable String nome){
			return serviceUsuario.getUsuarioForNome(nome);
	}
	
	@GetMapping("email/{email}")
	public ResponseEntity<List<Usuario>> pegarUsuarioEmail(@PathVariable String email){
		return serviceUsuario.getUsuarioForEmail(email);
	}

	@GetMapping("idade/{idade}")
	public ResponseEntity<List<Usuario>> pegarUsuarioIdade(@PathVariable Integer idade){
		return serviceUsuario.getUsuarioForIdade(idade);
	}
	@PostMapping
	public ResponseEntity<Usuario>novotUsuario(@RequestBody Usuario usuario){
		return serviceUsuario.postUsuario(usuario);
	}
	@PutMapping
	public ResponseEntity<Usuario>putUsuario(@RequestBody Usuario usuario){
		return serviceUsuario.postUsuario(usuario);
	}

}
