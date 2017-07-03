/*
@(#)DocenteFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Interface Local DocenteFacadeLocal que contiene el 
 * CRUD(crear,borrar,modificar,buscar) de la clase de entidad Docente
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.Docente;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Local
public interface DocenteFacadeLocal {

    void create(Docente docente);

    void edit(Docente docente);

    void remove(Docente docente);

    Docente find(Object id);

    List<Docente> findAll();

    List<Docente> findRange(int[] range);

    int count();
    
}
