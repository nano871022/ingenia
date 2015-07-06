package org.ingenia.negocio.gestor;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.ingenia.adaptadores.AdaptadorCurso;
import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;
import org.ingenia.negocio.entidades.Curso;
import org.ingenia.negocio.igestor.IGestorCursosLocal;
import org.ingenia.negocio.igestor.IGestorCursosRemote;

@Stateless
@LocalBean
public class GestorCursosProfesor implements IGestorCursosRemote,
		IGestorCursosLocal {

	@PersistenceContext(unitName = "ingeniaJPA")
	private EntityManager em;
	
	
	public GestorCursosProfesor() {

	}

	@Override
	public List<CursoVO> consultarTodosCursos() throws AdaptadorException {
		
		List<CursoVO> listaCursoVO = new ArrayList<CursoVO>();;
		CursoVO cursoVO=new CursoVO();
		AdaptadorCurso adaptador = null;
		Query q = em.createQuery("SELECT object(c) FROM Curso AS c");
		List<Curso> listaCurso= q.getResultList();
 
        for (int i=0;listaCurso.size()>i;i++) {
        
            adaptador = new AdaptadorCurso(listaCurso.get(i));
            try {
				cursoVO =adaptador.getCursoVO();

			} catch (AdaptadorException e) {
				// T ODO Auto-generated catch block
				e.printStackTrace();
			}
			listaCursoVO.add(cursoVO);
		}
        
        return listaCursoVO;
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
		AdaptadorCurso adaptador = null;
		
		Curso curso = em.find(Curso.class,cursoVO.getIdcurso());
		 adaptador = new AdaptadorCurso(curso);
		 cursoVO =adaptador.getCursoVO();
		return cursoVO;
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
	public void crearCursoVO(CursoVO cursoVO) throws AdaptadorException {
		// TODO Auto-generated method stub
	
		
		AdaptadorCurso adaptador = null;
		Curso curso = new Curso();
		 Query q = em.createQuery("SELECT count(c) FROM Curso as c");   
         cursoVO.setIdcurso(((Number) q.getResultList().get(0)).intValue()+1);
		adaptador = new AdaptadorCurso(cursoVO);

		try {
			
			curso = adaptador.getCurso();		  
            em.persist(curso);
	
		} catch (AdaptadorException e) {
			e.printStackTrace();
		}
		
	}

}
