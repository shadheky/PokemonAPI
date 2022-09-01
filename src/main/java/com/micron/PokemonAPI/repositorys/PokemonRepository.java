package com.micron.PokemonAPI.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.micron.PokemonAPI.entity.Pokemon;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, String>{

	
}
