package co.avengers.model;

import co.avengers.entities.Participacion;
import co.avengers.util.Conexion;

public class ParticipacionDAO 
extends Conexion<Participacion> 
implements GenericDao<Participacion> {

	public ParticipacionDAO() {
		super(Participacion.class);
		// TODO Auto-generated constructor stub
	}

	public ParticipacionDAO(Class<Participacion> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

}
