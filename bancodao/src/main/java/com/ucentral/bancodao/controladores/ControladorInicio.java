package com.ucentral.bancodao.controladores;

import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class ControladorInicio {
    @Autowired
    private ServicioUsuario servicioUsuario;


    @PostMapping ("/inicio")
    public String iniciosesion(@RequestParam String nombreUsuario, @RequestParam String password, Model modelo){
        Usuario usuario= servicioUsuario.findByNombreUsuario(nombreUsuario);
        if(usuario!=null && Objects.equals(usuario.getContrasena(), password)){
            return "listaTransacciones";
        }
        else {
            return "index";
        }

    }


}
