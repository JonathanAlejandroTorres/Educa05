/*
@(#)ProgramaFacade.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 * Clase que actua como punto de entrada a la Clase Programa 
 * y hereda los métodos de la misma.
 * ProgramaFacade es una interfaz unificada sencilla que actua como intermediaria
 * entre el cliente y la interfaz o grupo de interfaces mas complejas, delegando
 * las solicitudes del cliente a los objetos del subsistema correspondientes.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Programa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @author Diego Yandun
 */
@Stateless
public class ProgramaFacade extends AbstractFacade<Programa> implements ProgramaFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_EducaT05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaFacade() {
        super(Programa.class);
    }
    
}
