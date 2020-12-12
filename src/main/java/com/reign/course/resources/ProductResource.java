package com.reign.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reign.course.entities.Product;
import com.reign.course.services.ProductService;

// RECURSO WEB QUE E CONTROLADO POR UM CONTROLADOR REST
// ANOTATIONS NECESSARIAS PARA IDENTIFICAR FUNCIONALIDADE DA ENTIDADE
@RestController
@RequestMapping(value = "/products") // utilizado para nomear o recurso, mapeando o recurso
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	// METODO UTILIZADO COMO END POINT DE ACESSO AOS USUARIOS PARA RETORNAR RESPOSTAS DE UMA REQUISIÇÃO WEB
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// ENDPOINT QUE BUSCARA O USUARIO POR ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}