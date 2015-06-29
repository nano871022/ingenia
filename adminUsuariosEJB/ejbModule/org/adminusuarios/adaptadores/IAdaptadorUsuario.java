package org.adminusuarios.adaptadores;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.adminUsuarios.comunes.vo.UsuarioVO;
import org.adminusuarios.negocio.entidades.Usuario;

public abstract class IAdaptadorUsuario {
	Usuario usuario = null;
	UsuarioVO usuarioVO = null;

	public abstract Usuario getUsuario() throws AdaptadorException;

	public abstract UsuarioVO getUsuarioVO() throws AdaptadorException;

}
