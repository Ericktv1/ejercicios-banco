package com.ucentral.bancodao.operaciones;


import com.ucentral.bancodao.entidades.Usuario;

public interface OperacionesUsuario {

    public Usuario findByNombreUsuario(String nombreUsuario);
    public Usuario crear(Usuario usuario);
}
