package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clasificacion database table.
 * 
 */
@Entity
@NamedQuery(name="Clasificacion.findAll", query="SELECT c FROM Clasificacion c")
public class Clasificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	@Id
	private String id;

	public Clasificacion() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}