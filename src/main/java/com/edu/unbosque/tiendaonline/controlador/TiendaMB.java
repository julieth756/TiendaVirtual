package com.edu.unbosque.tiendaonline.controlador;


import com.edu.unbosque.tiendaonline.dao.ListDao;
import com.edu.unbosque.tiendaonline.entidad.Producto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julieth
 */
@ManagedBean
@SessionScoped
public class TiendaMB {
    Producto producto = new Producto();

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public List<Producto> getTodosLosPorductos(){
        List<Producto> pList = new ListDao().listProductos();
        return null;
    }
}
