package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.Curso;
import espe.edu.ec.educat.model.Programa;
import espe.edu.ec.educat.model.ProgramaCursoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(ProgramaCurso.class)
public class ProgramaCurso_ { 

    public static volatile SingularAttribute<ProgramaCurso, String> estado;
    public static volatile SingularAttribute<ProgramaCurso, Curso> curso;
    public static volatile SingularAttribute<ProgramaCurso, Programa> programa;
    public static volatile SingularAttribute<ProgramaCurso, ProgramaCursoPK> programaCursoPK;
    public static volatile SingularAttribute<ProgramaCurso, Short> orden;

}