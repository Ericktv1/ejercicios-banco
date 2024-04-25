package com.ucentral.bancodao.repositorios;


import com.ucentral.bancodao.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
}
