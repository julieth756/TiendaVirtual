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
    Categoria categoria = new Categoria();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String agregarCategoria(){
        categoria.setNombCategoria(categoria.getNombCategoria());
        categoria.setDescCategoria(categoria.getDescCategoria());
        boolean status = new AgregarDao().agregarCategoria(categoria);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos Recibidos", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos Recibidos", ""));
        }
        return null;
    }
}
