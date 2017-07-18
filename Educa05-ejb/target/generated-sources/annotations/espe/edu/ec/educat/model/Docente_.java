package espe.edu.ec.educat.model;

import espe.edu.ec.educat.model.Capacitacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T08:26:21")
@StaticMetamodel(Docente.class)
public class Docente_ { 

    public static volatile SingularAttribute<Docente, String> codDocente;
    public static volatile SingularAttribute<Docente, String> direccion;
    public static volatile ListAttribute<Docente, Capacitacion> capacitacionList;
    public static volatile SingularAttribute<Docente, String> telefono;
    public static volatile SingularAttribute<Docente, String> nombre;
    public static volatile SingularAttribute<Docente, String> correoElectronico;

}