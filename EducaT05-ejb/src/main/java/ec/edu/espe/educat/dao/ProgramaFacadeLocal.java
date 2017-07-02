/*
@(#)ProgramaFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase que permite al usuario acceder a los métodos de las clases que estan 
 * relacionadas con Programa, de tal manera que el usuario se comunique con el 
 * subsistema
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.Programa;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Diego Yandun
 */
@Local
public interface ProgramaFacadeLocal {

    void create(Programa programa);

    void edit(Programa programa);

    void remove(Programa programa);

    Programa find(Object id);

    List<Programa> findAll();

    List<Programa> findRange(int[] range);

    int count();
    
}
