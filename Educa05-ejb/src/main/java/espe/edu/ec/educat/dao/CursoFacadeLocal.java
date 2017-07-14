/*
@(#)CursoFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Interface Local CursoFacadeLocal que contiene el 
 * CRUD (crear,borrar,modificar,buscar) de la clase de entidad Curso
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Curso;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Local
public interface CursoFacadeLocal {

    void create(Curso curso);

    void edit(Curso curso);

    void remove(Curso curso);

    Curso find(Object id);

    List<Curso> findAll();

    List<Curso> findRange(int[] range);

    int count();
    
}
