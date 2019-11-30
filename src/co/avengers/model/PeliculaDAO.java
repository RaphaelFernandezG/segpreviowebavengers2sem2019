package co.avengers.model;

import co.avengers.entities.Pelicula;
import co.avengers.util.Conexion;

public class PeliculaDAO 
extends Conexion<Pelicula> 
implements GenericDao<Pelicula> {

	public PeliculaDAO() {
		super(Pelicula.class);
		// TODO Auto-generated constructor stub
	}

	public PeliculaDAO(Class<Pelicula> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
