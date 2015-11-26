/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.tiendaonline.controlador;

import com.edu.unbosque.tiendaonline.dao.AgregarDao;
import com.edu.unbosque.tiendaonline.dao.ListDao;
import com.edu.unbosque.tiendaonline.entidad.Producto;
import com.edu.unbosque.tiendaonline.entidad.Subcategoria;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Julieth
 */
@ManagedBean
@SessionScoped
public class ProductoMB {
    Producto producto = new Producto();
    Subcategoria subcat = new Subcategoria();
    String subcnomb;
    String nombCategoria="";
    List<Subcategoria> ListSubCat;

    public String getNombCategoria() {
        return nombCategoria;
    }

    public void setNombCategoria(String nombCategoria) {
        this.nombCategoria = nombCategoria;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Subcategoria getSubcat() {
        return subcat;
    }

    public void setSubcat(Subcategoria subcat) {
        this.subcat = subcat;
    }

    public String getSubcnomb() {
        return subcnomb;
    }

    public void setSubcnomb(String subcnomb) {
        this.subcnomb = subcnomb;
    }

    public List<Subcategoria> getListSubCat() {
        return ListSubCat;
    }

    public void setListSubCat(List<Subcategoria> ListSubCat) {
        this.ListSubCat = ListSubCat;
    }
    
    public String agregarProducto(){
        ListSubCat = new ListDao().subcatListPorNomre(subcnomb);
        //subcat.setIdenSubcategoria(listCate.get(0).getIdenCategoria());
        Subcategoria.setIdenCategoria(ListSubCat.get(0).getIdenSubcategoria());
        producto.setSubcategoria(subcat);
        producto.setNombProducto(producto.getNombProducto());
        producto.setCantProducto(producto.getCantProducto());
        producto.setPrecProducto(producto.getPrecProducto());
        producto.setUrlProducto(producto.getUrlProducto());
        producto.setDescProducto(producto.getDescProducto());
        boolean status = new AgregarDao().agregarProducto(producto);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos guardados", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos no guardados", ""));
        }
        return null;
    }
    
    
}
