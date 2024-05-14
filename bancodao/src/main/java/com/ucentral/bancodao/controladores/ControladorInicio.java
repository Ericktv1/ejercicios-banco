package com.ucentral.bancodao.controladores;

import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicio {
    @Autowired
    ServicioUsuario servicioUsuario;
    @GetMapping({"/usuario/iniciarsesion"})
    public String iniciarUsuario(Model model){
        Usuario usuariollenar= new Usuario();

        model.addAttribute("usuariollenar",usuariollenar);
        System.out.println("Paso por aca para iniciar");
        return "iniciarsesionUsuario";
    }



}
