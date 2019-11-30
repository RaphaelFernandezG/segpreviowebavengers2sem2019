package co.avengers.model;

import co.avengers.entities.Clasificacion;
import co.avengers.util.Conexion;

public class ClasificacionDAO 
extends Conexion<Clasificacion> 
implements GenericDao<Clasificacion> {

	public ClasificacionDAO() {
		super(Clasificacion.class);
		// TODO Auto-generated constructor stub
	}

	public ClasificacionDAO(Class<Clasificacion> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

}
