package com.edu.unbosque.tiendaonline.entidad;
// Generated 24/11/2015 08:30:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer idenRol;
     private String nombRol;
     private Set usuarios = new HashSet(0);

    public Rol() {
    }

	
    public Rol(String nombRol) {
        this.nombRol = nombRol;
    }
    public Rol(String nombRol, Set usuarios) {
       this.nombRol = nombRol;
       this.usuarios = usuarios;
    }
   
    public Integer getIdenRol() {
        return this.idenRol;
    }
    
    public void setIdenRol(Integer idenRol) {
        this.idenRol = idenRol;
    }
    public String getNombRol() {
        return this.nombRol;
    }
    
    public void setNombRol(String nombRol) {
        this.nombRol = nombRol;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


