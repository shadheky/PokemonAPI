package com.micron.PokemonAPI.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.micron.PokemonAPI.entity.Pokemon;
import com.micron.PokemonAPI.entity.enums.Type;
import com.micron.PokemonAPI.repositorys.PokemonRepository;

@Configuration
public class Instantiet implements CommandLineRunner{

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Override
	public void run(String... args) throws Exception {
		pokemonRepository.deleteAll();
		Pokemon bulbasaur = new Pokemon(null,1,"Bulbasaur",Arrays.asList(Type.GRASS));
		pokemonRepository.saveAll(Arrays.asList(bulbasaur));
		
	}

}
