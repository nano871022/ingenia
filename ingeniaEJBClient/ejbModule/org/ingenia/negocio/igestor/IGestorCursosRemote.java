package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Remote;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;

@Remote
public interface IGestorCursosRemote {

	public List<CursoVO> consultarTodosCursos() throws AdaptadorException;

	public List<CursoVO> consultarCursosPorUsuario(int idUsuario)
			throws AdaptadorException;

	public CursoVO consultarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public CursoVO modificarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public void eliminarCursoVO(CursoVO cursoVO) throws AdaptadorException;

	public void crearCursoVO(CursoVO cursoVO) throws AdaptadorException;

}
