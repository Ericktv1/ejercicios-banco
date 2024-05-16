package com.ucentral.bancodao.repositorios;

import com.ucentral.bancodao.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {
    public Usuario findByNombreUsuario(String nombreUsuario);
}
