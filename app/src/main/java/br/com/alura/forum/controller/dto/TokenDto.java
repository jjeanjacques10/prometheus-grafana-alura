package br.com.alura.forum.controller.dto;

import java.io.Serializable;

public class TokenDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String token;
	private String tipo;
	
	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
		
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}
	
	

}
