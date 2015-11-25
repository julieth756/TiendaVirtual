package com.edu.unbosque.tiendaonline.entidad;
// Generated 24/11/2015 08:30:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Subcategoria generated by hbm2java
 */
public class Subcategoria  implements java.io.Serializable {


     private Integer idenSubcategoria;
     private Categoria categoria;
     private String nombSubcategoria;
     private String descSubcategoria;
     private Set productos = new HashSet(0);

    public Subcategoria() {
    }

	
    public Subcategoria(Categoria categoria, String nombSubcategoria, String descSubcategoria) {
        this.categoria = categoria;
        this.nombSubcategoria = nombSubcategoria;
        this.descSubcategoria = descSubcategoria;
    }
    public Subcategoria(Categoria categoria, String nombSubcategoria, String descSubcategoria, Set productos) {
       this.categoria = categoria;
       this.nombSubcategoria = nombSubcategoria;
       this.descSubcategoria = descSubcategoria;
       this.productos = productos;
    }
   
    public Integer getIdenSubcategoria() {
        return this.idenSubcategoria;
    }
    
    public void setIdenSubcategoria(Integer idenSubcategoria) {
        this.idenSubcategoria = idenSubcategoria;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getNombSubcategoria() {
        return this.nombSubcategoria;
    }
    
    public void setNombSubcategoria(String nombSubcategoria) {
        this.nombSubcategoria = nombSubcategoria;
    }
    public String getDescSubcategoria() {
        return this.descSubcategoria;
    }
    
    public void setDescSubcategoria(String descSubcategoria) {
        this.descSubcategoria = descSubcategoria;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


