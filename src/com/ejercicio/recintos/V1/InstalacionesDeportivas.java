package com.ejercicio.recintos.V1;

public class InstalacionesDeportivas implements instalacionDeportiva  {
	String nombreEdificio;
	int ancho;
	int largo;
	InstalacionesDeportivas(String nombreEdificio, int ancho, int largo){
		this.nombreEdificio = nombreEdificio;
		this.ancho = ancho;
		this.largo = largo;
	}
	@Override
	public String getNombreEdificio() {
		// TODO Auto-generated method stub
		return this.nombreEdificio;
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return this.ancho * this.largo;
	}

	@Override
	public int getTipoInstalacion() {
		// TODO Auto-generated method stub
		return this.TIPO_INSTALACION;
	}
	public String toString(){
		return "nombre de instalacion deportiva: "+getNombreEdificio()+" Superficie"+ getSuperficie()+" TipoInstalacion"+ getTipoInstalacion();
	}

}
