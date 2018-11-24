package sv.edu.udb.NoFunciona.entities;
// Generated 11-23-2018 08:10:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios"
    ,catalog="lacuponera"
    , uniqueConstraints = @UniqueConstraint(columnNames="correo") 
)
public class Usuarios  implements java.io.Serializable {


     private int idUsuario;
     private String correo;
     private String clave;
     private int tipo;
     private Set<Empleados> empleadoses = new HashSet<Empleados>(0);
     private Set<Empresas> empresases = new HashSet<Empresas>(0);
     private Set<Clientes> clienteses = new HashSet<Clientes>(0);

    public Usuarios() {
    }

	
    public Usuarios(int idUsuario, String correo, String clave, int tipo) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.clave = clave;
        this.tipo = tipo;
    }
    public Usuarios(int idUsuario, String correo, String clave, int tipo, Set<Empleados> empleadoses, Set<Empresas> empresases, Set<Clientes> clienteses) {
       this.idUsuario = idUsuario;
       this.correo = correo;
       this.clave = clave;
       this.tipo = tipo;
       this.empleadoses = empleadoses;
       this.empresases = empresases;
       this.clienteses = clienteses;
    }
   
     @Id 

    
    @Column(name="id_usuario", unique=true, nullable=false)
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    @Column(name="correo", unique=true, nullable=false, length=500)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Column(name="clave", nullable=false, length=50)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    @Column(name="tipo", nullable=false)
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Empleados> getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set<Empleados> empleadoses) {
        this.empleadoses = empleadoses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Empresas> getEmpresases() {
        return this.empresases;
    }
    
    public void setEmpresases(Set<Empresas> empresases) {
        this.empresases = empresases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set<Clientes> getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set<Clientes> clienteses) {
        this.clienteses = clienteses;
    }




}


