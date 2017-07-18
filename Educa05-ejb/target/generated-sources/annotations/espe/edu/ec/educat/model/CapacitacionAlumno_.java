package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.Alumno;
import espe.edu.ec.educat.model.Capacitacion;
import espe.edu.ec.educat.model.CapacitacionAlumnoPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(CapacitacionAlumno.class)
public class CapacitacionAlumno_ { 

    public static volatile SingularAttribute<CapacitacionAlumno, String> estado;
    public static volatile SingularAttribute<CapacitacionAlumno, Capacitacion> capacitacion;
    public static volatile SingularAttribute<CapacitacionAlumno, BigDecimal> notaFinal;
    public static volatile SingularAttribute<CapacitacionAlumno, Alumno> alumno;
    public static volatile SingularAttribute<CapacitacionAlumno, CapacitacionAlumnoPK> capacitacionAlumnoPK;

}