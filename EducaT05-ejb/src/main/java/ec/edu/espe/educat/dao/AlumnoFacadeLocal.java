/*
@(#)AlumnoFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Interface Local AlumnoFacadeLocal que contiene el 
 * CRUD(crear,borrar,modificar,buscar) de la clase de entidad Alumno
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.Alumno;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Jefferson Tambaco
 */
@Local
public interface AlumnoFacadeLocal {

    void create(Alumno alumno);

    void edit(Alumno alumno);

    void remove(Alumno alumno);

    Alumno find(Object id);

    List<Alumno> findAll();

    List<Alumno> findRange(int[] range);

    int count();
    
}
