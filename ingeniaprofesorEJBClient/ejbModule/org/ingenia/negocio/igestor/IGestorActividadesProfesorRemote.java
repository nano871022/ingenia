package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Remote;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;

@Remote
public interface IGestorActividadesProfesorRemote {
	public ActividadVO crearActividadVO(ActividadVO actividadVO)
			throws AdaptadorException;

	public ActividadVO modificarActividadVO(ActividadVO actividadVO)
			throws AdaptadorException;

	public void eliminarActividadVO(ActividadVO actividadVO)
			throws AdaptadorException;

	public List<ActividadVO> consultarActividadDisponibles()
			throws AdaptadorException;

	public ActividadVO consultarActividadVO(ActividadVO actividadVO)
			throws AdaptadorException;
}
