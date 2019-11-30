package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ubicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Ubicacion.findAll", query="SELECT u FROM Ubicacion u")
public class Ubicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int idpelicula;

	private int idplaneta;

	public Ubicacion() {
	}

	public int getIdpelicula() {
		return this.idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public int getIdplaneta() {
		return this.idplaneta;
	}

	public void setIdplaneta(int idplaneta) {
		this.idplaneta = idplaneta;
	}

}