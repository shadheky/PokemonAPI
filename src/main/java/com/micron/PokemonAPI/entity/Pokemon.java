package com.micron.PokemonAPI.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.micron.PokemonAPI.entity.enums.Type;

@Document
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Integer pokeDexNumber;
	private String name;
	
	
	 List<Type> types;
	// List<Move> moves;

	public Pokemon() {

	}

	public Pokemon(String id, Integer pokeDexNumber, String name, List<Type> types) {
		super();
		this.id = id;
		this.pokeDexNumber = pokeDexNumber;
		this.name = name;
		this.types = types;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPokeDexNumber() {
		return pokeDexNumber;
	}

	public void setPokeDexNumber(Integer pokeDexNumber) {
		this.pokeDexNumber = pokeDexNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Type> getTypes(){
		return types;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(id, other.id);
	}

}
