package co.avengers.model;

import co.avengers.entities.Ubicacion;
import co.avengers.util.Conexion;

public class UbicacionDAO 
extends Conexion<Ubicacion> 
implements GenericDao<Ubicacion> {

	public UbicacionDAO() {
		super(Ubicacion.class);
		// TODO Auto-generated constructor stub
	}

	public UbicacionDAO(Class<Ubicacion> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
