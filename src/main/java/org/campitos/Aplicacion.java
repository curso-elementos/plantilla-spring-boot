/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Controller
public class Aplicacion {
    @RequestMapping("/")
    public String inicio(){
        return "inicio.html";
    }
    @RequestMapping(value="/reservacion", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String guardar()throws Exception{
        
   
        return "reservacion guardada con exito";
    }
    public static void main(String[] args)throws Exception{
      SpringApplication.run(Aplicacion.class, args);
      /*
  //    El siguiente codigo funciona como se espera :D
       DAOReservacion daor=new DAOReservacion();
       DAOCliente daoc=new DAOCliente();
       DAOTarjeta1 daot=new DAOTarjeta1();
      Cliente c1=new Cliente();
      c1.setEmail("rapidclimate@gmail.com");
      c1.setNombre("Erika");
      c1.setPaterno("Campos");
      daoc.guardar(c1);
      
      Tarjeta1 t1=new Tarjeta1();
      t1.setIdCliente(c1);
      t1.setNombreTarjeta("Chase");
      t1.setNumeroTarjeta(123333);
      t1.setSaldo(12000f);
      daot.guardar(t1);
      
      Reservacion reservacion=new Reservacion();
      reservacion.setIdCliente(c1);
      reservacion.setIdTarjeta(t1);
      
      reservacion.setCiudadDestino("Huatulco");
      reservacion.setNombreHotel("Bahias Huatulco");
      reservacion.setNumeroPersonas(2);
        
      daor.guardar(reservacion);
*/

    }
    
}
