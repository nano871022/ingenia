package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the respuesta database table.
 * 
 */
@Embeddable
public class RespuestaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idrespuesta;

	@Column(insertable=false, updatable=false)
	private int idactividad;

	public RespuestaPK() {
	}
	public int getIdrespuesta() {
		return this.idrespuesta;
	}
	public void setIdrespuesta(int idrespuesta) {
		this.idrespuesta = idrespuesta;
	}
	public int getIdactividad() {
		return this.idactividad;
	}
	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespuestaPK)) {
			return false;
		}
		RespuestaPK castOther = (RespuestaPK)other;
		return 
			(this.idrespuesta == castOther.idrespuesta)
			&& (this.idactividad == castOther.idactividad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idrespuesta;
		hash = hash * prime + this.idactividad;
		
		return hash;
	}
}