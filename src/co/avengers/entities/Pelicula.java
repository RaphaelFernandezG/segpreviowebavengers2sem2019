package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the pelicula database table.
 * 
 */
@Entity
@NamedQuery(name="Pelicula.findAll", query="SELECT p FROM Pelicula p")
public class Pelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal anolanzamiento;

	private BigDecimal anosecuencia;

	private String clasificacion;

	@Id
	private int id;

	private String nombre;

	@Lob
	private String sinopsis;

	public Pelicula() {
	}

	public BigDecimal getAnolanzamiento() {
		return this.anolanzamiento;
	}

	public void setAnolanzamiento(BigDecimal anolanzamiento) {
		this.anolanzamiento = anolanzamiento;
	}

	public BigDecimal getAnosecuencia() {
		return this.anosecuencia;
	}

	public void setAnosecuencia(BigDecimal anosecuencia) {
		this.anosecuencia = anosecuencia;
	}

	public String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
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

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

}