/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorCliente {
    
  
 @RequestMapping(value="/cliente/{nombre}/{paterno}/{email}",
         method=RequestMethod.POST,headers={"Accept=text/html"})
 @ResponseBody String guardar(@PathVariable String nombre,
         @PathVariable String paterno, @PathVariable String email)throws Exception{
     //Invocamos al DAOGUardar y su respectivo objeto
     DAOCliente daoc=new DAOCliente();
     Cliente c=new Cliente(nombre, paterno, email);
     daoc.guardar(c);
     
     return "Cliente guardado con exito";
 }
 
  @RequestMapping(value="/cliente",
         method=RequestMethod.GET,headers={"Accept=application/json"})
 @ResponseBody String buscarTodos()throws Exception{
     //Invocamos al DAOGUardar y su respectivo objeto
     DAOCliente daoc=new DAOCliente();
    ArrayList<Cliente> clientes=daoc.buscarTodos(); 
   ObjectMapper maper=new ObjectMapper();
     
     return maper.writeValueAsString(clientes);
 }
 
 @RequestMapping(value="/cliente/{nombre}/{paterno}/{email}",
         method=RequestMethod.PUT,headers={"Accept=text/html"})
 @ResponseBody String actualizar(@PathVariable String nombre,
         @PathVariable String paterno, @PathVariable String email)throws Exception{
     //Invocamos al DAOGUardar y su respectivo objeto
     DAOCliente daoc=new DAOCliente();
     Cliente c=new Cliente(nombre, paterno, email);
     daoc.actualizar(c);
     
     return "Cliente guardado con exito";
 }
 
    
    
}
