/*
 * Entidad que almacena los cursos que pertenecen a un programa. 
 */
package ec.edu.espe.edu.educat.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jeffe
 */
@Entity
@Table(name = "programa_curso")

public class ProgramaCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProgramaCursoPK programaCursoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN", nullable = false)
    /*
    * Atributo que almacena el orden del curso a lo largo del programa
    */
    private short orden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    /* 
    * Atributo que almacena el estado de un programa, este puede ser activo o 
    * inactivo (ACT - INA)
    */
    private String estado;
    @JoinColumn(name = "COD_CURSO", referencedColumnName = "COD_CURSO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    /*
    * Llave primaria de 8 caracteres que corresponde al curso 
    */
    private Curso curso;
    @JoinColumn(name = "COD_PROGRAMA", referencedColumnName = "COD_PROGRAMA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    /*
    * Llave primaria de 8 caracteres que corresponde al programa
    */
    private Programa programa;

    public ProgramaCurso() {
    }

    public ProgramaCurso(ProgramaCursoPK programaCursoPK) {
        this.programaCursoPK = programaCursoPK;
    }

    public ProgramaCurso(ProgramaCursoPK programaCursoPK, short orden, String estado) {
        this.programaCursoPK = programaCursoPK;
        this.orden = orden;
        this.estado = estado;
    }

    public ProgramaCurso(String codPrograma, String codCurso) {
        this.programaCursoPK = new ProgramaCursoPK(codPrograma, codCurso);
    }

    public ProgramaCursoPK getProgramaCursoPK() {
        return programaCursoPK;
    }

    public void setProgramaCursoPK(ProgramaCursoPK programaCursoPK) {
        this.programaCursoPK = programaCursoPK;
    }

    public short getOrden() {
        return orden;
    }

    public void setOrden(short orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaCursoPK != null ? programaCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaCurso)) {
            return false;
        }
        ProgramaCurso other = (ProgramaCurso) object;
        if ((this.programaCursoPK == null && other.programaCursoPK != null) || (this.programaCursoPK != null && !this.programaCursoPK.equals(other.programaCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.edu.educat.model.ProgramaCurso[ programaCursoPK=" + programaCursoPK + " ]";
    }
    
}
