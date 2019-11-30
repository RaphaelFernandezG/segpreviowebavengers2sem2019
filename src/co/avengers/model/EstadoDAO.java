package co.avengers.model;

import co.avengers.entities.Estado;
import co.avengers.util.Conexion;

public class EstadoDAO 
extends Conexion<Estado> 
implements GenericDao<Estado> {

	public EstadoDAO() {
		super(Estado.class);
		// TODO Auto-generated constructor stub
	}

	public EstadoDAO(Class<Estado> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
