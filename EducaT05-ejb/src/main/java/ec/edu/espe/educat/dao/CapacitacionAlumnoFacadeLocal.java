/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.CapacitacionAlumno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DiegoXavierYandun
 */
@Local
public interface CapacitacionAlumnoFacadeLocal {

    void create(CapacitacionAlumno capacitacionAlumno);

    void edit(CapacitacionAlumno capacitacionAlumno);

    void remove(CapacitacionAlumno capacitacionAlumno);

    CapacitacionAlumno find(Object id);

    List<CapacitacionAlumno> findAll();

    List<CapacitacionAlumno> findRange(int[] range);

    int count();
    
}
