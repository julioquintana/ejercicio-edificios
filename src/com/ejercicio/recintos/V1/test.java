package com.ejercicio.recintos.V1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creano una clase (InstalacionesDeportivas, Edificios)para cada interface
		// y procesando individualmente 
		edificio r = new Edificios(5,"Edificio QuintanaSystem",12,5,4);
		System.out.println(r);
		instalacionDeportiva f = new InstalacionesDeportivas("cancha elcaruto",12,50);
		System.out.println(f);
		
		//procesando las dos interface desde una sola clase (recinto)
		edificio r1 = new recinto(3,"Edificio QuintanaSystem",32,45,4);
		System.out.println(r1);
		
		instalacionDeportiva r11 = new recinto("cancha elcaruto",10,50);
		System.out.println(r11);
		
	}

}
