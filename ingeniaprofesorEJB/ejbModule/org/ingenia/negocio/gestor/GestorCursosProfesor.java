package org.ingenia.negocio.gestor;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;
import org.ingenia.negocio.igestor.IGestorCursosProfesorLocal;
import org.ingenia.negocio.igestor.IGestorCursosProfesorRemote;

@Stateless
@LocalBean
public class GestorCursosProfesor implements IGestorCursosProfesorRemote,
		IGestorCursosProfesorLocal {

	public GestorCursosProfesor() {

	}

	@Override
	public List<CursoVO> consultarTodosCursos() throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CursoVO> consultarCursosPorUsuario(int idUsuario)
			throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CursoVO consultarCursoVO(CursoVO cursoVO) throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CursoVO modificarCursoVO(CursoVO cursoVO) throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCursoVO(CursoVO cursoVO) throws AdaptadorException {
		// TODO Auto-generated method stub

	}

	@Override
	public CursoVO crearCursoVO(CursoVO cursoVO) throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

}
