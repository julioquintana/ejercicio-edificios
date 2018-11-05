package com.ejercicio.recintos.V1;

public class Edificios implements edificio {
	int nroOficinas;
	String nombreEdificio;
	int ancho;
	int largo;
	int pisos;
	Edificios(int nroOfi, String nEdif, int ancho, int largo,int pisos){
		this.nombreEdificio = nEdif;
		this.nroOficinas = nroOfi;
		this.ancho = ancho;
		this.largo = largo;
		this.pisos = pisos;
	}
	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return this.ancho * this.largo * this.pisos;
	}

	@Override
	public int getNroOficinas() {
		// TODO Auto-generated method stub
		return this.nroOficinas;
	}

	@Override
	public String getNombreEdificio() {
		// TODO Auto-generated method stub
		return this.nombreEdificio;
	}

	//@Override
	//public int getTipoInstalacion() {
		// TODO Auto-generated method stub
//		return this.TIPO_INSTALACION;
	//}
	
	public String toString(){
		return "nombre: "+getNombreEdificio()+" Superficie"+ getSuperficie() +" nro de oficinas"+ getNroOficinas();
	}
}
