/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.tiendaonline.controlador;

import com.edu.unbosque.tiendaonline.dao.AgregarDao;
import com.edu.unbosque.tiendaonline.entidad.Categoria;
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
public class CategoriaMB {
    Categoria cat = new Categoria();

    public Categoria getCategoria() {
        return cat;
    }

    public void setCategoria(Categoria cat) {
        this.cat = cat;
    }
    
    public String agregarCategoria(){
        cat.setNombCategoria(cat.getNombCategoria());
        cat.setDescCategoria(cat.getDescCategoria());
        boolean status = new AgregarDao().agregarCategoria(cat);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos guardados", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos no guardados", ""));
        }
        return null;
    }
}
