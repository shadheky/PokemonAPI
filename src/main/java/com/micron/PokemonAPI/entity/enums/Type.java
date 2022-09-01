package com.micron.PokemonAPI.entity.enums;

public enum Type {
	BUG(1),
	DARK(2),
	DRAGON(3),
	ELETRIC(4),
	FIGHTING(5),
	FIRE(6),
	FLYING(7),
	GHOST(8),
	GRASS(9),
	GROUND(10),
	ICE(11),
	NORMAL(12),
	POSION(13),
	PSYCHIC(14),
	ROCK(15),
	WATER(16)
	;
	
	private int code;
	
	private Type(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	
	public static Type valueOf(int code) {
		for(Type value: Type.values()) {
			if(value.getCode() == code) {
				return value;
			}}
		throw new IllegalArgumentException("Invalid Type code");
	}
	
}
