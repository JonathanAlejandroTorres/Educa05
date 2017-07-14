/*
@(#)CapacitacionFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Interface Local CapacitacionFacadeLocal que contiene el 
 * CRUD (crear,borrar,modificar,buscar) de la clase de entidad Capacitacion
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Capacitacion;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Local
public interface CapacitacionFacadeLocal {

    void create(Capacitacion capacitacion);

    void edit(Capacitacion capacitacion);

    void remove(Capacitacion capacitacion);

    Capacitacion find(Object id);

    List<Capacitacion> findAll();

    List<Capacitacion> findRange(int[] range);

    int count();
    
}
