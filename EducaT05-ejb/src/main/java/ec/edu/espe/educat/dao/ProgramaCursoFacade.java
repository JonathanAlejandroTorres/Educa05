/*
@(#)ProgramaCursoFacade.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase que se encarga de contener los métodos de las clases que estan relacionadas
 *con ProgramaCurso para que el usuario pueda realizar las peticiones, 
 * accediendo así al subsistema
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.ProgramaCurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @author Diego Yandun
 */
@Stateless
public class ProgramaCursoFacade extends AbstractFacade<ProgramaCurso> implements ProgramaCursoFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_EducaT05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaCursoFacade() {
        super(ProgramaCurso.class);
    }
    
}
