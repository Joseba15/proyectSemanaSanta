package com.edu.model;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Cancion>{

	
	public ComparadorPorNombre() {
		
	}
	
	@Override
	public int compare(Cancion o1, Cancion o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
