/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.tiendaonline.controlador;

import com.edu.unbosque.tiendaonline.dao.AgregarDao;
import com.edu.unbosque.tiendaonline.dao.ListDao;
import com.edu.unbosque.tiendaonline.entidad.Categoria;
import com.edu.unbosque.tiendaonline.entidad.Subcategoria;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author jcobos
 */
@ManagedBean
@SessionScoped
public class SubcategoriaMB {
    Subcategoria subcategoria = new Subcategoria();
    String nombCategoria;
    List<Categoria> listCate;

    public List<Categoria> getListCate() {
        return listCate;
    }

    public void setListCate(List<Categoria> listCate) {
        this.listCate = listCate;
    }
    
    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getNombCategoria() {
        return nombCategoria;
    }

    public void setNombCategoria(String nombCategoria) {
        this.nombCategoria = nombCategoria;
    }
    
    public String agregarSubcategoria(){
        listCate = new ListDao().catListPorNomre(nombCategoria);
        subcategoria.setIdenSubcategoria(listCate.get(0).getIdenCategoria());
        subcategoria.setNombSubcategoria(subcategoria.getNombSubcategoria());
        subcategoria.setDescSubcategoria(subcategoria.getDescSubcategoria());
        boolean status = new AgregarDao().agregarSubcategoria(subcategoria);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos Recibidos", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos Recibidos", ""));
        }
        return null;
    }
}
