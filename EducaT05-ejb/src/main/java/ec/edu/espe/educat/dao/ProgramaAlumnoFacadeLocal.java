/*
@(#)ProgramaAlumnoFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase que se encarga de contener los métodos de las clases que estan relacionadas
 * con ProgramaAlumno para que el usuario pueda realizar las peticiones de manera sencilla,
 * accediendo así al subsistema
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.ProgramaAlumno;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Diego Yandun
 */
@Local
public interface ProgramaAlumnoFacadeLocal {

    void create(ProgramaAlumno programaAlumno);

    void edit(ProgramaAlumno programaAlumno);

    void remove(ProgramaAlumno programaAlumno);

    ProgramaAlumno find(Object id);

    List<ProgramaAlumno> findAll();

    List<ProgramaAlumno> findRange(int[] range);

    int count();
    
}
