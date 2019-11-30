package co.avengers.model;

import co.avengers.entities.Heroe;
import co.avengers.util.Conexion;

public class HeroeDAO 
extends Conexion<Heroe> 
implements GenericDao<Heroe> {

	public HeroeDAO() {
		super(Heroe.class);
		// TODO Auto-generated constructor stub
	}

	public HeroeDAO(Class<Heroe> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
