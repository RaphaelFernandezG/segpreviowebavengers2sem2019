package co.avengers.model;

import co.avengers.entities.Planeta;
import co.avengers.util.Conexion;

public class PlanetaDAO 
extends Conexion<Planeta> 
implements GenericDao<Planeta> {

	public PlanetaDAO() {
		super(Planeta.class);
		// TODO Auto-generated constructor stub
	}

	public PlanetaDAO(Class<Planeta> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
