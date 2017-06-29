/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.ProgramaAlumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alejandro Torres
 */
@Stateless
public class ProgramaAlumnoFacade extends AbstractFacade<ProgramaAlumno> implements ProgramaAlumnoFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_EducaT05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaAlumnoFacade() {
        super(ProgramaAlumno.class);
    }
    
}