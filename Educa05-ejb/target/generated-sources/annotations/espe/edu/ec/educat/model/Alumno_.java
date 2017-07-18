package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.CapacitacionAlumno;
import espe.edu.ec.educat.model.ProgramaAlumno;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> codAlumno;
    public static volatile ListAttribute<Alumno, ProgramaAlumno> programaAlumnoList;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, String> genero;
    public static volatile SingularAttribute<Alumno, String> direccion;
    public static volatile SingularAttribute<Alumno, String> telefono;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, String> correoElectronico;
    public static volatile ListAttribute<Alumno, CapacitacionAlumno> capacitacionAlumnoList;

}