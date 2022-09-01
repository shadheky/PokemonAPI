package com.micron.PokemonAPI.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micron.PokemonAPI.entity.Pokemon;
import com.micron.PokemonAPI.services.PokemonService;

@RestController
@RequestMapping(value = "/pokemons")
public class PokemonResource {

	@Autowired
	private PokemonService service;
	
	@GetMapping
	public ResponseEntity<List<Pokemon>> findAll(){
		
		List<Pokemon> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
}
