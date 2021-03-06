package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;
import org.ingenia.negocio.entidades.Actividad;
import org.ingenia.negocio.entidades.Juego;


public class AdaptadorActividad extends IAdaptadorActividad{

	
	public AdaptadorActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public AdaptadorActividad(ActividadVO actividadVO) {
		this.actividadVO = actividadVO;
	}
	
	@Override
	public Actividad getActividad() throws AdaptadorException {
		Actividad actividad = null;
		if (actividadVO == null)
			return null;
		actividad = new Actividad();
		actividad.setEnunciado(actividadVO.getEnunciado());
		actividad.setIdactividad(actividadVO.getIdactividad());
		actividad.setUrl_texto_ensenanza(actividadVO.getUrl_conocimiento());
		return actividad;
	}

	@Override
	public ActividadVO getActividadVO() throws AdaptadorException {
		ActividadVO actividadVO = null;
		if (actividad == null)
			return null;
		actividadVO=new ActividadVO();
		
		return actividadVO;
	}

}
