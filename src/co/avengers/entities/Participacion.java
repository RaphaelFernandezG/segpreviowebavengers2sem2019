package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the participacion database table.
 * 
 */
@Entity
@NamedQuery(name="Participacion.findAll", query="SELECT p FROM Participacion p")
public class Participacion implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private int idheroe;

	private int idpelicula;

	public Participacion() {
	}

	public int getIdheroe() {
		return this.idheroe;
	}

	public void setIdheroe(int idheroe) {
		this.idheroe = idheroe;
	}

	public int getIdpelicula() {
		return this.idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

}