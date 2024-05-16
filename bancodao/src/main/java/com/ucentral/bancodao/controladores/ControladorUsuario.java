package com.ucentral.bancodao.controladores;

import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.operaciones.OperacionesUsuario;
import com.ucentral.bancodao.servicios.ServicioUsuario;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;


@Controller
public class ControladorUsuario {
    @Autowired
    private OperacionesUsuario operacionesUsuario;


    @GetMapping({"/usuario/nuevo"})
    public String cargarUsuario(Model model) {
        Usuario usuariollenar = new Usuario();

        model.addAttribute("usuariollenar", usuariollenar);
        System.out.println("PAso por aca formulario");
        return "formcrearusuario";
    }

    @GetMapping({"/usuario/iniciarsesion"})
    public String iniciarUsuario(Model model) {
        System.out.println("Paso por aca para iniciar");
        return "iniciarsesionUsuario";
    }


    @PostMapping({"/accioncrear"})
    public String accioncrear(@ModelAttribute("usuariollenar") Usuario usuario) {
        System.out.println("Paso por aca para guardar formulario");
        System.out.println(usuario);
        operacionesUsuario.crear(usuario);
        return "redirect:http://localhost:8862/";
    }
}