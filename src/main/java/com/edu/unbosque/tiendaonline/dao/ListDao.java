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
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author jcobos
 */
public class ListDao {
    public List catList(){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Categoria> cList=session.createQuery("SELECT al.nombCategoria FROM Categoria al").list();
        cList.toString();
        session.close();
        return cList;
    }
    
    public List<Categoria> catListPorNomre(String nombre){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Categoria> cList=session.createQuery("SELECT al FROM Categoria al where lower(nombCategoria)='"+nombre.toLowerCase()+"'").list();
        cList.toString();
        session.close();
        return cList;
    }
    
     public List<Subcategoria> subcatListPorNomre(String nombre){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Subcategoria> sList=session.createQuery("SELECT al FROM Subcategoria al.idenSubcategoria al.categoria.idenCategoria IN (select a.idenCategoria from Categoria a where lower(a.NombCategoria)='"+nombre.toLowerCase()+"'").list();
        sList.toString();
        session.close();
        return sList;
    }
     
         public List listProductos(){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Producto> sList=session.createQuery("SELECT al FROM Producto al").list();
        sList.toString();
        session.close();
        return sList;
    }
}
