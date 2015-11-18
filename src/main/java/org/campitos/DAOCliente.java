/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

/**
 *
 * @author campitos
 */

public class DAOCliente {
    public  SessionFactory sessionFactory;
    public  Session session;
    public  Transaction transaction;
    public DAOCliente(){
     sessionFactory=   HibernateUtilidades.getSessionFactory();
     session=sessionFactory.openSession();
     transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardar(Cliente reservacion)throws Exception{
        session.save(reservacion);
        cerrarTodo();
    }

    ArrayList<Cliente> buscarTodos() throws Exception{
  ArrayList<Cliente>clientes=  (ArrayList<Cliente>) session.createCriteria(Cliente.class).list();
  cerrarTodo();
  
    return clientes;
    }
    
    Cliente actualizar(Cliente c)throws Exception{
        
         c=(Cliente) session.createCriteria(Cliente.class).add(Restrictions.idEq(c.getIdCliente())).uniqueResult();
         
         return c;
    }
    
}   