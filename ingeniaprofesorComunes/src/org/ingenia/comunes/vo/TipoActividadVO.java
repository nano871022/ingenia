package org.ingenia.comunes.vo;

import java.io.Serializable;

public class TipoActividadVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idtipoActividad;

	private String nombre;

	public TipoActividadVO() {
	}

	public int getIdtipoActividad() {
		return this.idtipoActividad;
	}

	public void setIdtipoActividad(int idtipoActividad) {
		this.idtipoActividad = idtipoActividad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}