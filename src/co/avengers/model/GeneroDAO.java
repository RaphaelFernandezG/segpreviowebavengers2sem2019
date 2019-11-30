package co.avengers.model;

import co.avengers.entities.Genero;
import co.avengers.util.Conexion;

public class GeneroDAO 
extends Conexion<Genero> 
implements GenericDao<Genero> {

	public GeneroDAO() {
		super(Genero.class);
		// TODO Auto-generated constructor stub
	}

	public GeneroDAO(Class<Genero> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
