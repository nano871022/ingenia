package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the curso database table.
 * 
 */
@Embeddable
public class CursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idcurso;

	@Column(insertable=false, updatable=false)
	private int idprofesor;

	public CursoPK() {
	}
	public int getIdcurso() {
		return this.idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public int getIdprofesor() {
		return this.idprofesor;
	}
	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CursoPK)) {
			return false;
		}
		CursoPK castOther = (CursoPK)other;
		return 
			(this.idcurso == castOther.idcurso)
			&& (this.idprofesor == castOther.idprofesor);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idcurso;
		hash = hash * prime + this.idprofesor;
		
		return hash;
	}
}