package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the planeta database table.
 * 
 */
@Entity
@NamedQuery(name="Planeta.findAll", query="SELECT p FROM Planeta p")
public class Planeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	public Planeta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}