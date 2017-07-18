package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.CapacitacionAlumno;
import espe.edu.ec.educat.model.Curso;
import espe.edu.ec.educat.model.Docente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(Capacitacion.class)
public class Capacitacion_ { 

    public static volatile SingularAttribute<Capacitacion, String> estado;
    public static volatile SingularAttribute<Capacitacion, Date> fechaInicio;
    public static volatile SingularAttribute<Capacitacion, Docente> codDocente;
    public static volatile SingularAttribute<Capacitacion, Curso> codCurso;
    public static volatile SingularAttribute<Capacitacion, Integer> codCapacitacion;
    public static volatile SingularAttribute<Capacitacion, Date> fechaFin;
    public static volatile ListAttribute<Capacitacion, CapacitacionAlumno> capacitacionAlumnoList;
    public static volatile SingularAttribute<Capacitacion, Short> capacidad;

}