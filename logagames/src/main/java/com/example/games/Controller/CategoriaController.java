package com.example.games.Controller;

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

import com.example.games.model.Categoria;
import com.example.games.Repository.CategoriaRepository;


@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository CategoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok( CategoriaRepository.findAll());
		}
	
	 @GetMapping("/{id}")       
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		return   CategoriaRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	        }
	 @GetMapping("/tipo/{tipo}")
	public ResponseEntity <List<Categoria>> getByName(@PathVariable String tipo){
		return  ResponseEntity.ok( CategoriaRepository.findAllByTipoContainingIgnoreCase(tipo));
	}
	 @PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria ){
		return ResponseEntity.status(HttpStatus.CREATED).body( CategoriaRepository.save(categoria));
		}
	 @PutMapping
		public ResponseEntity<Categoria> put(@RequestBody Categoria categoria ){
			return ResponseEntity.ok( CategoriaRepository.save(categoria));
	 }
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		 CategoriaRepository.deleteById(id);
	
	}

}