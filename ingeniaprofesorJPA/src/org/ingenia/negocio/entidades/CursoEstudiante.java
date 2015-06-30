package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the curso_estudiante database table.
 * 
 */
@Entity
@Table(name="curso_estudiante")
@NamedQuery(name="CursoEstudiante.findAll", query="SELECT c FROM CursoEstudiante c")
public class CursoEstudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CursoEstudiantePK id;

	private int puntaje;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idcurso")
	private Curso curso;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public CursoEstudiante() {
	}

	public CursoEstudiantePK getId() {
		return this.id;
	}

	public void setId(CursoEstudiantePK id) {
		this.id = id;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}