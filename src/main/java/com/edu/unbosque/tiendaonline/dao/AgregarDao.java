/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.tiendaonline.dao;

import com.edu.unbosque.tiendaonline.entidad.Categoria;
import com.edu.unbosque.tiendaonline.entidad.Producto;
import com.edu.unbosque.tiendaonline.entidad.Subcategoria;
import com.edu.unbosque.tiendaonline.util.HibernateUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author jcobos
 */
@ManagedBean
@SessionScoped
public class AgregarDao {
    
    public boolean agregarCategoria(Categoria cat){
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(cat);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false; 
        }  
    }
    
        public boolean agregarSubcategoria(Subcategoria subcat){
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(subcat);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false; 
        }  
    }
        
         public boolean agregarProducto(Producto prod){
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(prod);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false; 
        }  
    }
}
