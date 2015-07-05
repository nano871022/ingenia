package org.ingenia.negocio.gestor;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.ingenia.negocio.igestor.IGestorActividadesLocal;
import org.ingenia.negocio.igestor.IGestorActividadesRemote;

/**
 * Session Bean implementation class GestorActividades
 */
@Stateless
@LocalBean
public class GestorActividades implements IGestorActividadesRemote, IGestorActividadesLocal {

    /**
     * Default constructor. 
     */
    public GestorActividades() {
        // TODO Auto-generated constructor stub
    }

}
