package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.ProgramaAlumno;
import espe.edu.ec.educat.model.ProgramaCurso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(Programa.class)
public class Programa_ { 

    public static volatile SingularAttribute<Programa, String> descripcion;
    public static volatile ListAttribute<Programa, ProgramaAlumno> programaAlumnoList;
    public static volatile SingularAttribute<Programa, Date> fechaInicio;
    public static volatile ListAttribute<Programa, ProgramaCurso> programaCursoList;
    public static volatile SingularAttribute<Programa, String> codPrograma;
    public static volatile SingularAttribute<Programa, Short> duracion;
    public static volatile SingularAttribute<Programa, String> nombre;
    public static volatile SingularAttribute<Programa, Date> fechaFin;

}