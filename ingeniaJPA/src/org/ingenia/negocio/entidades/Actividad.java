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

	@Column(name="limite_movimientos")
	private int limiteMovimientos;

	@Column(name="posicion_actividad")
	private int posicionActividad;

	private byte publicado;

	@Column(name="url_texto_enseñanza")
	private String urlTextoEnseñanza;

	//bi-directional many-to-one association to Juego
	@ManyToOne
	@JoinColumn(name="idtipo_juego")
	private Juego juego;

	//bi-directional many-to-one association to Actividadusuario
	@OneToMany(mappedBy="actividad")
	private List<Actividadusuario> actividadusuarios;

	//bi-directional many-to-many association to Estructura
	@ManyToMany(mappedBy="actividads")
	private List<Estructura> estructuras;

	//bi-directional many-to-many association to Gato
	@ManyToMany(mappedBy="actividads")
	private List<Gato> gatos;

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

	public int getLimiteMovimientos() {
		return this.limiteMovimientos;
	}

	public void setLimiteMovimientos(int limiteMovimientos) {
		this.limiteMovimientos = limiteMovimientos;
	}

	public int getPosicionActividad() {
		return this.posicionActividad;
	}

	public void setPosicionActividad(int posicionActividad) {
		this.posicionActividad = posicionActividad;
	}

	public byte getPublicado() {
		return this.publicado;
	}

	public void setPublicado(byte publicado) {
		this.publicado = publicado;
	}

	public String getUrlTextoEnseñanza() {
		return this.urlTextoEnseñanza;
	}

	public void setUrlTextoEnseñanza(String urlTextoEnseñanza) {
		this.urlTextoEnseñanza = urlTextoEnseñanza;
	}

	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public List<Actividadusuario> getActividadusuarios() {
		return this.actividadusuarios;
	}

	public void setActividadusuarios(List<Actividadusuario> actividadusuarios) {
		this.actividadusuarios = actividadusuarios;
	}

	public Actividadusuario addActividadusuario(Actividadusuario actividadusuario) {
		getActividadusuarios().add(actividadusuario);
		actividadusuario.setActividad(this);

		return actividadusuario;
	}

	public Actividadusuario removeActividadusuario(Actividadusuario actividadusuario) {
		getActividadusuarios().remove(actividadusuario);
		actividadusuario.setActividad(null);

		return actividadusuario;
	}

	public List<Estructura> getEstructuras() {
		return this.estructuras;
	}

	public void setEstructuras(List<Estructura> estructuras) {
		this.estructuras = estructuras;
	}

	public List<Gato> getGatos() {
		return this.gatos;
	}

	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
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