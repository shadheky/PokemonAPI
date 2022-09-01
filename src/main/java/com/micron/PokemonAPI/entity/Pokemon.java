package com.micron.PokemonAPI.entity;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Integer pokeDexNumber;
	private String name;
	// List<Type> types;
	// List<Move> moves;

	public Pokemon() {

	}

	public Pokemon(String id, Integer pokeDexNumber, String name) {
		super();
		this.id = id;
		this.pokeDexNumber = pokeDexNumber;
		this.name = name;
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
