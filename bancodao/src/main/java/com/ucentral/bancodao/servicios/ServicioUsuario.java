package com.ucentral.bancodao.servicios;


import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.operaciones.OperacionesUsuario;
import com.ucentral.bancodao.repositorios.RepositorioUsuario;
import lombok.AllArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class ServicioUsuario implements OperacionesUsuario {
    @Autowired
    RepositorioUsuario repositorioUsuario;


    @Override
    public Usuario crear(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
    }

