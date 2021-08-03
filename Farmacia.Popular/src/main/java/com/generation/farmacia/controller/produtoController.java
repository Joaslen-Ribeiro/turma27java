package com.generation.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.Produto;
import com.generation.farmacia.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class produtoController {

	@Autowired
	private ProdutoRepository repository; 
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id ){
		return repository.findById(id).map(resp-> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));	
	}
	@GetMapping("/preco/{preco}")
	public ResponseEntity<List<Produto>> GetByPreco(@PathVariable double preco){
		return ResponseEntity.ok(repository.findAllByPreco(preco));
	}
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	@PutMapping
	public ResponseEntity <Produto> put (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable long id) {
		repository.deleteById(id); 
	 }
}