package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcurso;

	private byte activo;

	private String descripcion;

	private String estado;

	private String nombre;

	//bi-directional many-to-one association to CursoActividad
	@OneToMany(mappedBy="curso")
	private List<CursoActividad> cursoActividads;

	//bi-directional many-to-one association to CursoEstudiante
	@OneToMany(mappedBy="curso")
	private List<CursoEstudiante> cursoEstudiantes;

	public Curso() {
	}

	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CursoActividad> getCursoActividads() {
		return this.cursoActividads;
	}

	public void setCursoActividads(List<CursoActividad> cursoActividads) {
		this.cursoActividads = cursoActividads;
	}

	public CursoActividad addCursoActividad(CursoActividad cursoActividad) {
		getCursoActividads().add(cursoActividad);
		cursoActividad.setCurso(this);

		return cursoActividad;
	}

	public CursoActividad removeCursoActividad(CursoActividad cursoActividad) {
		getCursoActividads().remove(cursoActividad);
		cursoActividad.setCurso(null);

		return cursoActividad;
	}

	public List<CursoEstudiante> getCursoEstudiantes() {
		return this.cursoEstudiantes;
	}

	public void setCursoEstudiantes(List<CursoEstudiante> cursoEstudiantes) {
		this.cursoEstudiantes = cursoEstudiantes;
	}

	public CursoEstudiante addCursoEstudiante(CursoEstudiante cursoEstudiante) {
		getCursoEstudiantes().add(cursoEstudiante);
		cursoEstudiante.setCurso(this);

		return cursoEstudiante;
	}

	public CursoEstudiante removeCursoEstudiante(CursoEstudiante cursoEstudiante) {
		getCursoEstudiantes().remove(cursoEstudiante);
		cursoEstudiante.setCurso(null);

		return cursoEstudiante;
	}

}