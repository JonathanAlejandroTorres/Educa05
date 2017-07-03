/*
@(#)CapacitacionAlumnoFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Interface Local CapacitacionAlumnoFacadeLocal que contiene el 
 * CRUD(crear,borrar,modificar,buscar) de la clase de entidad CapacitacionAlumno
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.CapacitacionAlumno;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Jefferson Tambaco
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
