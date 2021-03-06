package com.edu.unbosque.tiendaonline.entidad;
// Generated 24/11/2015 08:30:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idenProducto;
     private Subcategoria subcategoria;
     private String nombProducto;
     private int cantProducto;
     private double precProducto;
     private String urlProducto;
     private String descProducto;
     private Set ordenproductodetalles = new HashSet(0);

    public Producto() {
    }

	
    public Producto(Subcategoria subcategoria, String nombProducto, int cantProducto, double precProducto, String urlProducto, String descProducto) {
        this.subcategoria = subcategoria;
        this.nombProducto = nombProducto;
        this.cantProducto = cantProducto;
        this.precProducto = precProducto;
        this.urlProducto = urlProducto;
        this.descProducto = descProducto;
    }
    public Producto(Subcategoria subcategoria, String nombProducto, int cantProducto, double precProducto, String urlProducto, String descProducto, Set ordenproductodetalles) {
       this.subcategoria = subcategoria;
       this.nombProducto = nombProducto;
       this.cantProducto = cantProducto;
       this.precProducto = precProducto;
       this.urlProducto = urlProducto;
       this.descProducto = descProducto;
       this.ordenproductodetalles = ordenproductodetalles;
    }
   
    public Integer getIdenProducto() {
        return this.idenProducto;
    }
    
    public void setIdenProducto(Integer idenProducto) {
        this.idenProducto = idenProducto;
    }
    public Subcategoria getSubcategoria() {
        return this.subcategoria;
    }
    
    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }
    public String getNombProducto() {
        return this.nombProducto;
    }
    
    public void setNombProducto(String nombProducto) {
        this.nombProducto = nombProducto;
    }
    public int getCantProducto() {
        return this.cantProducto;
    }
    
    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
    public double getPrecProducto() {
        return this.precProducto;
    }
    
    public void setPrecProducto(double precProducto) {
        this.precProducto = precProducto;
    }
    public String getUrlProducto() {
        return this.urlProducto;
    }
    
    public void setUrlProducto(String urlProducto) {
        this.urlProducto = urlProducto;
    }
    public String getDescProducto() {
        return this.descProducto;
    }
    
    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }
    public Set getOrdenproductodetalles() {
        return this.ordenproductodetalles;
    }
    
    public void setOrdenproductodetalles(Set ordenproductodetalles) {
        this.ordenproductodetalles = ordenproductodetalles;
    }




}


