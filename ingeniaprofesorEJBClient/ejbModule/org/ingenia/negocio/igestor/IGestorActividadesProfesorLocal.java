package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Local;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;

@Local
public interface IGestorActividadesProfesorLocal {

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
