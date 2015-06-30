package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the actividad database table.
 * 
 */
@Entity
@NamedQuery(name="Actividad.findAll", query="SELECT a FROM Actividad a")
public class Actividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idactividad;

	private byte activo;

	private String enunciado;

	@Column(name="idactividad_autocompletar")
	private int idactividadAutocompletar;

	private byte publicado;

	//bi-directional many-to-one association to TipoActividad
	@ManyToOne
	@JoinColumn(name="idtipo_actividad")
	private TipoActividad tipoActividad;

	//bi-directional many-to-one association to CursoActividad
	@OneToMany(mappedBy="actividad")
	private List<CursoActividad> cursoActividads;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy="actividad")
	private List<Respuesta> respuestas;

	public Actividad() {
	}

	public int getIdactividad() {
		return this.idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
	}

	public String getEnunciado() {
		return this.enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getIdactividadAutocompletar() {
		return this.idactividadAutocompletar;
	}

	public void setIdactividadAutocompletar(int idactividadAutocompletar) {
		this.idactividadAutocompletar = idactividadAutocompletar;
	}

	public byte getPublicado() {
		return this.publicado;
	}

	public void setPublicado(byte publicado) {
		this.publicado = publicado;
	}

	public TipoActividad getTipoActividad() {
		return this.tipoActividad;
	}

	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public List<CursoActividad> getCursoActividads() {
		return this.cursoActividads;
	}

	public void setCursoActividads(List<CursoActividad> cursoActividads) {
		this.cursoActividads = cursoActividads;
	}

	public CursoActividad addCursoActividad(CursoActividad cursoActividad) {
		getCursoActividads().add(cursoActividad);
		cursoActividad.setActividad(this);

		return cursoActividad;
	}

	public CursoActividad removeCursoActividad(CursoActividad cursoActividad) {
		getCursoActividads().remove(cursoActividad);
		cursoActividad.setActividad(null);

		return cursoActividad;
	}

	public List<Respuesta> getRespuestas() {
		return this.respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Respuesta addRespuesta(Respuesta respuesta) {
		getRespuestas().add(respuesta);
		respuesta.setActividad(this);

		return respuesta;
	}

	public Respuesta removeRespuesta(Respuesta respuesta) {
		getRespuestas().remove(respuesta);
		respuesta.setActividad(null);

		return respuesta;
	}

}