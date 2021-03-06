package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idusuario;

	private String alias;

	private String apellido;

	private String clave;

	private String correo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_ultimo_ingreso")
	private Date fechaUltimoIngreso;

	private String genero;

	private String nombre;

	//bi-directional many-to-one association to CursoEstudiante
	@OneToMany(mappedBy="usuario")
	private List<CursoEstudiante> cursoEstudiantes;

	//bi-directional many-to-one association to Mensaje
	@OneToMany(mappedBy="usuario1")
	private List<Mensaje> mensajes1;

	//bi-directional many-to-one association to Mensaje
	@OneToMany(mappedBy="usuario2")
	private List<Mensaje> mensajes2;

	public Usuario() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaUltimoIngreso() {
		return this.fechaUltimoIngreso;
	}

	public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
		this.fechaUltimoIngreso = fechaUltimoIngreso;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CursoEstudiante> getCursoEstudiantes() {
		return this.cursoEstudiantes;
	}

	public void setCursoEstudiantes(List<CursoEstudiante> cursoEstudiantes) {
		this.cursoEstudiantes = cursoEstudiantes;
	}

	public CursoEstudiante addCursoEstudiante(CursoEstudiante cursoEstudiante) {
		getCursoEstudiantes().add(cursoEstudiante);
		cursoEstudiante.setUsuario(this);

		return cursoEstudiante;
	}

	public CursoEstudiante removeCursoEstudiante(CursoEstudiante cursoEstudiante) {
		getCursoEstudiantes().remove(cursoEstudiante);
		cursoEstudiante.setUsuario(null);

		return cursoEstudiante;
	}

	public List<Mensaje> getMensajes1() {
		return this.mensajes1;
	}

	public void setMensajes1(List<Mensaje> mensajes1) {
		this.mensajes1 = mensajes1;
	}

	public Mensaje addMensajes1(Mensaje mensajes1) {
		getMensajes1().add(mensajes1);
		mensajes1.setUsuario1(this);

		return mensajes1;
	}

	public Mensaje removeMensajes1(Mensaje mensajes1) {
		getMensajes1().remove(mensajes1);
		mensajes1.setUsuario1(null);

		return mensajes1;
	}

	public List<Mensaje> getMensajes2() {
		return this.mensajes2;
	}

	public void setMensajes2(List<Mensaje> mensajes2) {
		this.mensajes2 = mensajes2;
	}

	public Mensaje addMensajes2(Mensaje mensajes2) {
		getMensajes2().add(mensajes2);
		mensajes2.setUsuario2(this);

		return mensajes2;
	}

	public Mensaje removeMensajes2(Mensaje mensajes2) {
		getMensajes2().remove(mensajes2);
		mensajes2.setUsuario2(null);

		return mensajes2;
	}

}