package org.adminusuarios.adaptadores;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.adminUsuarios.comunes.vo.OpcionVO;
import org.adminusuarios.negocio.entidades.Opcion;

public abstract class IAdaptadorOpcion {
	Opcion opcion = null;
	OpcionVO opcionVO = null;

	public abstract Opcion getOpcion() throws AdaptadorException;

	public abstract OpcionVO getOpcionVO() throws AdaptadorException;

}
