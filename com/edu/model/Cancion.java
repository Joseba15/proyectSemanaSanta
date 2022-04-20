package com.edu.model;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Objects;



public class Cancion  {

	private String nombre;
	private String autor;
	private String album;
	private TipoGenero tipoGen;
	private LocalTime duracion;
	
	public Cancion(String nombre, String autor, String album, TipoGenero tipoGen, LocalTime duracion) {

		this.nombre = nombre;
		this.autor = autor;
		this.album = album;
		this.tipoGen = tipoGen;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public String getAlbum() {
		return album;
	}

	public TipoGenero getTipoGen() {
		return tipoGen;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if (this != null) {
			if (this==obj) {
				sonIguales=true;
			}else {
				Cancion other = (Cancion) obj;
				sonIguales=this.autor.equals(other.getAutor()) &&
						this.nombre.equals(other.getNombre());
			}
		}
	
		return sonIguales;
	}

	@Override
	public String toString() {
		return "Cancion con el titulo" + nombre + 
				", su autor " + autor + 
				", del album " + album + 
				", genero " + tipoGen+ 
				", y dura " + duracion + " minutos";
	}
	
	
	
	

	
	
}
