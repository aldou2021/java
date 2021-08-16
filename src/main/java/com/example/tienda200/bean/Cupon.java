package com.example.tienda200.bean;

import java.io.Serializable;

public class Cupon implements Serializable{
	
	private  String cuponActivo;

	
	
	public Cupon() {
		
	}

	public String getCuponActivo() {
		return cuponActivo;
	}

	public void setCuponActivo(String cuponActivo) {
		this.cuponActivo = cuponActivo;
	}
	
	public boolean verificacion() {
		return (cuponActivo.equals("agosto2021")?true:false);
	}
}
