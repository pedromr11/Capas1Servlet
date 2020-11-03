package com.pedro.negocio;

import java.io.IOException;
import java.util.ArrayList;

import com.pedro.datos.Datos;

public class Logica {
	
	public Integer coches(String nombre) { 
		
		
		int numeroCoches = 0;
		
		
		Datos d = new Datos();
		ArrayList<String> listNom;
		try {
			listNom = new ArrayList <String> (d.consultaCoches(nombre));
			
			
			for(int i = 0; i < listNom.size(); i++) {
				if(listNom.get(i).equals(nombre)) {
					numeroCoches++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return numeroCoches;
		
	}

}