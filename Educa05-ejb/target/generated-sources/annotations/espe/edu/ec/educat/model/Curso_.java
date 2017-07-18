package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.Capacitacion;
import espe.edu.ec.educat.model.ProgramaCurso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> objetivo;
    public static volatile SingularAttribute<Curso, String> descripcion;
    public static volatile SingularAttribute<Curso, String> estado;
    public static volatile ListAttribute<Curso, ProgramaCurso> programaCursoList;
    public static volatile SingularAttribute<Curso, String> codCurso;
    public static volatile SingularAttribute<Curso, Short> duracion;
    public static volatile ListAttribute<Curso, Capacitacion> capacitacionList;
    public static volatile SingularAttribute<Curso, String> nombre;

}