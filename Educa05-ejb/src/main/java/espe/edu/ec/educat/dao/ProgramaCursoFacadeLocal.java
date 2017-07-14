/*
@(#)ProgramaCursoFacadeLocal.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase que permite al usuario acceder a los métodos de las clases que estan 
 * relacionadas con ProgramaCurso, comunicandose con el subsistema
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.ProgramaCurso;
import java.util.List;
import javax.ejb.Local;

/**
 * @version 1.0
 * @author Diego Yandun
 */
@Local
public interface ProgramaCursoFacadeLocal {

    void create(ProgramaCurso programaCurso);

    void edit(ProgramaCurso programaCurso);

    void remove(ProgramaCurso programaCurso);

    ProgramaCurso find(Object id);

    List<ProgramaCurso> findAll();

    List<ProgramaCurso> findRange(int[] range);

    int count();
    
}
