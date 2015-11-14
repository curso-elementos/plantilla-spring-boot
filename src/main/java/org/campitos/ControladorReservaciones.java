/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/reservaciones")
public class ControladorReservaciones {
    
    @RequestMapping("/guardar")
    @ResponseBody String guardar()throws Exception{
         DAOReservacion daor=new DAOReservacion();
       DAOCliente daoc=new DAOCliente();
       DAOTarjeta1 daot=new DAOTarjeta1();
      Cliente c1=new Cliente();
      c1.setEmail("yo@gmail.com");
      c1.setNombre("Chana");
      c1.setPaterno("Lopez");
      daoc.guardar(c1);
      
      Tarjeta1 t1=new Tarjeta1();
      t1.setIdCliente(c1);
      t1.setNombreTarjeta("Banco Azteca");
      t1.setNumeroTarjeta(666);
      t1.setSaldo(120f);
      daot.guardar(t1);
      
      Reservacion reservacion=new Reservacion();
      reservacion.setIdCliente(c1);
      reservacion.setIdTarjeta(t1);
      
      reservacion.setCiudadDestino("Playas del D F");
      reservacion.setNombreHotel("Casa de campaña");
      reservacion.setNumeroPersonas(12);
        
      daor.guardar(reservacion);
        return "Reservacion gaurdada con exito!";
    }
    
}
