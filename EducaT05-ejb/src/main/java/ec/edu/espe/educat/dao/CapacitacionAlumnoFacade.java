/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.CapacitacionAlumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DiegoXavierYandun
 */
@Stateless
public class CapacitacionAlumnoFacade extends AbstractFacade<CapacitacionAlumno> implements CapacitacionAlumnoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_EducaT05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionAlumnoFacade() {
        super(CapacitacionAlumno.class);
    }
    
}
