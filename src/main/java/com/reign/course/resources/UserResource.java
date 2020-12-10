package com.reign.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reign.course.entities.User;

// RECURSO WEB QUE E CONTROLADO POR UM CONTROLADOR REST
// ANOTATIONS NECESSARIAS PARA IDENTIFICAR FUNCIONALIDADE DA ENTIDADE
@RestController
@RequestMapping(value = "/users") // utilizado para nomear o recurso, mapeando o recurso
public class UserResource {
	
	// METODO UTILIZADO COMO END POINT DE ACESSO AOS USUARIOS PARA RETORNAR RESPOSTAS DE UMA REQUISIÇÃO WEB
	// NO MOMENTO ESTÁ SENDO UTILIZADO APENAS PARA TESTAR A FUNCIONALIDADE, SERA ALTERADO POSTERIORMENTE
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}