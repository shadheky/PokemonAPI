package com.micron.PokemonAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micron.PokemonAPI.entity.Pokemon;
import com.micron.PokemonAPI.repositorys.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	private PokemonRepository PokeRepository;
	
	public List<Pokemon> findAll(){
		return PokeRepository.findAll();
	}
	
}
