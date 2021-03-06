package org.ingenia.presentacion.beans;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.ingenia.comunes.vo.RolVO;
import org.ingenia.comunes.vo.UsuarioVO;
import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;
import org.ingenia.negocio.igestor.IGestorCursosLocal;
import org.ingenia.presentacion.BaseMB;
import org.springframework.context.annotation.Scope;

@ManagedBean(name = "AdmCursoMB")
@SessionScoped
public class AdmCursoMB extends BaseMB {

	private static final long serialVersionUID = 6956796593946333976L;

	private CursoVO cursoVO=new CursoVO();
	private String curso;
	private List<CursoVO> listaCursos;

	private final static String NAV_IRCURSO = "ircurso";
	private final static String NAV_IRADMCURSO = "iradmincurso";

	@EJB
	IGestorCursosLocal gestorCursos;


	/*public void init() {
		
		
			try {
			
				this.listaCursos=gestorCursos.consultarTodosCursos();
			} catch (AdaptadorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}*/
	
	  public String doSeleccionarCurso() {
	        String destino = null;
	        cursoVO = new CursoVO();
	        int idCurso = Integer.parseInt(recuperarIdParametro("idcurso"));
	        //estudiantes = gestorCursos.estudiantesPorCurso(cursoVO.getId());
	        cursoVO.setIdcurso(idCurso);
	        try {
				this.cursoVO = gestorCursos.consultarCursoVO(cursoVO);
				
				   destino = "busqueda.resultados";
			} catch (AdaptadorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       

	        return destino;
	    }
	
	public String buscar() {//es mas como un filtro
		CursoVO CursoVO = new CursoVO();
		CursoVO.setNombre(curso);
		UsuarioVO profesorVO = new UsuarioVO();
		profesorVO.setId(7890);
		CursoVO.setProfesor(profesorVO);
	
		try {
			listaCursos = gestorCursos.consultarCursosPorNombre(CursoVO);
		} catch (AdaptadorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return NAV_IRADMCURSO;
	}

	public void guardar() {
		
		try {
			gestorCursos.modificarCursoVO(this.cursoVO);

		} catch (AdaptadorException e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
							"Error de concersion de tipos!"));
			e.printStackTrace();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e
							.getMessage()));
			e.printStackTrace();
		}
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
						"La operacion fue realizada satisfactoriamente !"));
	}

	public void crear() {

		CursoVO cursoVO = this.cursoVO;
		UsuarioVO profesorVO = new UsuarioVO();

		try {
			profesorVO.setId(123456);
			cursoVO.setProfesor(profesorVO);
			gestorCursos.crearCursoVO(cursoVO);

		} catch (AdaptadorException e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
							"Error de concersion de tipos!"));
			e.printStackTrace();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e
							.getMessage()));
			e.printStackTrace();
		}
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
						"La operacion fue realizada satisfactoriamente !"));
	}

	public String irCurso() {
		
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext()
				.getRequestParameterMap();

		String id = params.get("id");
		CursoVO cursoVO = new CursoVO();
		cursoVO.setIdcurso(Integer.parseInt(id));

		try {
			this.cursoVO = gestorCursos.consultarCursoVO(cursoVO);
            
		} catch (AdaptadorException e) {
			e.printStackTrace();
		}

		return NAV_IRCURSO;
	}

	public CursoVO getCursoVO() {

		return cursoVO;
	}

	public void setCursoVO(CursoVO cursoVO) {
		this.cursoVO = cursoVO;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<CursoVO> getListaCursos() {

	//cuanod autentica el profesor se habilita la carga automatica
		  if (listaCursos == null) {
			  try {

				listaCursos = gestorCursos.consultarCursosProfesor(7890);
			} catch (AdaptadorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	
	
		return listaCursos;
	}

	public void setListaCursos(List<CursoVO> listaCursos) {
		this.listaCursos = listaCursos;
	}


}
