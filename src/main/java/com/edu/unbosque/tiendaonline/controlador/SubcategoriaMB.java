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
import javax.faces.model.SelectItem;

/**
 *
 * @author jcobos
 */
@ManagedBean
@SessionScoped
public class SubcategoriaMB {
    Subcategoria subcat = new Subcategoria();
    String nombCategoria;
    List<Categoria> listCate;
    Categoria categoria = new Categoria();

    public List<Categoria> getListCate() {
        return listCate;
    }

    public void setListCate(List<Categoria> listCate) {
        this.listCate = listCate;
    }
    
    public Subcategoria getSubcategoria() {
        return subcat;
    }

    public void setSubcategoria(Subcategoria subcat) {
        this.subcat = subcat;
    }

    public String getNombCategoria() {
        return nombCategoria;
    }

    public void setNombCategoria(String nombCategoria) {
        this.nombCategoria = nombCategoria;
    }
    
    public String agregarSubcategoria(){
        listCate = new ListDao().catListPorNomre(nombCategoria);
        //subcat.setIdenSubcategoria(listCate.get(0).getIdenCategoria());
        categoria.setIdenCategoria(listCate.get(0).getIdenCategoria());
        subcat.setNombSubcategoria(subcat.getNombSubcategoria());
        subcat.setDescSubcategoria(subcat.getDescSubcategoria());
        boolean status = new AgregarDao().agregarSubcategoria(subcat);
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos guardados", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos no guardados", ""));
        }
        return null;
    }
    
    public List<SelectItem> getNombreCategorias(){
        List<SelectItem> nombCategoria = new ListDao().catList();
        return nombCategoria;
    }
}
