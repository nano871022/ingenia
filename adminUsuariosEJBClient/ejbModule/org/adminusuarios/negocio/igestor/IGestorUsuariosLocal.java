package org.adminusuarios.negocio.igestor;

import java.util.List;

import javax.ejb.Local;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.adminUsuarios.comunes.vo.RolVO;
import org.adminUsuarios.comunes.vo.UsuarioVO;

@Local
public interface IGestorUsuariosLocal {

	public List<UsuarioVO> consultarUsuarios(UsuarioVO usuario);

	public UsuarioVO consultarUsuario(UsuarioVO usuario);

	public UsuarioVO modificarUsuario(UsuarioVO usuario)
			throws AdaptadorException;

	public void crearUsuario(UsuarioVO usuario) throws AdaptadorException;

	public List<RolVO> consultarRoles(RolVO rol);

	public RolVO consultarRol(RolVO rol);

	public RolVO modificarRol(RolVO rol) throws AdaptadorException;

	public void CrearRol(RolVO rol) throws AdaptadorException;

}
