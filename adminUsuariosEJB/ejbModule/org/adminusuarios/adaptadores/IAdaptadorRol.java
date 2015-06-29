package org.adminusuarios.adaptadores;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.adminUsuarios.comunes.vo.RolVO;
import org.adminusuarios.negocio.entidades.Rol;

public abstract class IAdaptadorRol {
	Rol rol = null;
	RolVO rolVO = null;

	public abstract Rol getRol() throws AdaptadorException;

	public abstract RolVO getRolVO() throws AdaptadorException;

}
