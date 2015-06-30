package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Local;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;

@Local
public interface IGestorCursosProfesorLocal {

	public List<CursoVO> consultarTodosCursos() throws AdaptadorException;

	public List<CursoVO> consultarCursosPorUsuario(int idUsuario)
			throws AdaptadorException;

	public CursoVO consultarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public CursoVO modificarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public void eliminarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public CursoVO crearCursoVO(CursoVO cursoVO) throws AdaptadorException;

}
