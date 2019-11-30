package co.avengers.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the heroe database table.
 * 
 */
@Entity
@NamedQuery(name="Heroe.findAll", query="SELECT h FROM Heroe h")
public class Heroe implements Serializable {
	private static final long serialVersionUID = 1L;

	private String arma;

	@Lob
	private String descripcion;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fechaaparicion;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String genero;

	private String heroe;

	@Id
	private int id;

	private String nombre;

	public Heroe() {
	}

	public String getArma() {
		return this.arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaaparicion() {
		return this.fechaaparicion;
	}

	public void setFechaaparicion(Date fechaaparicion) {
		this.fechaaparicion = fechaaparicion;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHeroe() {
		return this.heroe;
	}

	public void setHeroe(String heroe) {
		this.heroe = heroe;
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