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
@RequestMapping("/")
public class ControladorLeer {
    
    @RequestMapping("/lectura")
    @ResponseBody String lectura()throws Exception{
        MiMensaje objeto=new MiMensaje();
        return objeto.leer();
    }
    
}
