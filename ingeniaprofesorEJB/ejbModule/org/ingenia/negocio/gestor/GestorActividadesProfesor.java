package org.ingenia.negocio.gestor;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.adminUsuarios.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;
import org.ingenia.negocio.igestor.IGestorActividadesProfesorLocal;
import org.ingenia.negocio.igestor.IGestorActividadesProfesorRemote;

@Stateless
@LocalBean
public class GestorActividadesProfesor implements
		IGestorActividadesProfesorRemote, IGestorActividadesProfesorLocal {

	public GestorActividadesProfesor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActividadVO crearActividadVO(ActividadVO actividadVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActividadVO modificarActividadVO(ActividadVO actividadVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarActividadVO(ActividadVO actividadVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ActividadVO> consultarActividadDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActividadVO consultarActividadVO(ActividadVO actividadVO)
			throws AdaptadorException {
		// TODO Auto-generated method stub
		return null;
	}

}
