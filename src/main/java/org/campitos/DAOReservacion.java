/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 *
 * @author campitos
 */

public class DAOReservacion {
    public  SessionFactory sessionFactory;
    public  Session session;
    public  Transaction transaction;
    public DAOReservacion(){
     sessionFactory=   HibernateUtilidades.getSessionFactory();
     session=sessionFactory.openSession();
     transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardar(Reservacion reservacion)throws Exception{
        session.save(reservacion);
        cerrarTodo();
    }
    
    
}
