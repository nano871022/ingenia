package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the curso_actividad database table.
 * 
 */
@Entity
@Table(name="curso_actividad")
@NamedQuery(name="CursoActividad.findAll", query="SELECT c FROM CursoActividad c")
public class CursoActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CursoActividadPK id;

	private int posicion;

	//bi-directional many-to-one association to Actividad
	@ManyToOne
	@JoinColumn(name="idactividad")
	private Actividad actividad;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idcurso")
	private Curso curso;

	public CursoActividad() {
	}

	public CursoActividadPK getId() {
		return this.id;
	}

	public void setId(CursoActividadPK id) {
		this.id = id;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Actividad getActividad() {
		return this.actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}