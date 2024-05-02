package com.ucentral.bancodao.controladores;

import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.servicios.ServicioUsuario;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;


public class ControladorUsuario {
@Autowired
    ServicioUsuario servicioUsuario;

public void crearUsuario(Usuario usuario){servicioUsuario.crear(usuario);}
}
