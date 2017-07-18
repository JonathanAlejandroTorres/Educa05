package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.Alumno;
import espe.edu.ec.educat.model.Programa;
import espe.edu.ec.educat.model.ProgramaAlumnoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(ProgramaAlumno.class)
public class ProgramaAlumno_ { 

    public static volatile SingularAttribute<ProgramaAlumno, String> estado;
    public static volatile SingularAttribute<ProgramaAlumno, Programa> programa;
    public static volatile SingularAttribute<ProgramaAlumno, Alumno> alumno;
    public static volatile SingularAttribute<ProgramaAlumno, ProgramaAlumnoPK> programaAlumnoPK;

}