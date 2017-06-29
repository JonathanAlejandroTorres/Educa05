/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.ProgramaCurso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alejandro Torres
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
