/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.ProgramaAlumno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alejandro Torres
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
