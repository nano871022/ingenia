package org.adminusuarios.adaptadores;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.adminUsuarios.comunes.vo.UsuarioVO;
import org.adminusuarios.negocio.entidades.Usuario;

public class AdaptadorUsuario extends IAdaptadorUsuario {

	public AdaptadorUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AdaptadorUsuario(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}

	@Override
	public Usuario getUsuario() throws AdaptadorException {
		Usuario usuario = null;
		if (usuarioVO == null)
			return null;
		usuario = new Usuario();
		usuario.setApellido(usuarioVO.getApellido());
		usuario.setCorreo(usuarioVO.getCorreo());
		usuario.setFechaCreacion(usuarioVO.getFechaCreacion());
		usuario.setFechaUltimoIngreso(usuarioVO.getFechaUltimoIngreso());
		usuario.setGenero(null);
		usuario.setIdUsuario(usuarioVO.getId());
		usuario.setNombre(usuarioVO.getNombre());
		usuario.setClave(usuarioVO.getClave());
		usuario.setAlias(usuarioVO.getAlias());
		return usuario;
	}

	@Override
	public UsuarioVO getUsuarioVO() throws AdaptadorException {
		UsuarioVO usuarioVO = null;
		if (usuario == null)
			return null;

		usuarioVO = new UsuarioVO();
		usuarioVO.setApellido(usuario.getApellido());
		usuarioVO.setCorreo(usuario.getCorreo());
		usuarioVO.setFechaCreacion(usuario.getFechaCreacion());
		usuarioVO.setFechaUltimoIngreso(usuario.getFechaUltimoIngreso());
		usuarioVO.setGenero(null);
		usuarioVO.setId(usuario.getIdUsuario());
		usuarioVO.setNombre(usuario.getNombre());
		usuarioVO.setClave(usuario.getClave());
		usuarioVO.setAlias(usuario.getAlias());
		return usuarioVO;
	}

}
