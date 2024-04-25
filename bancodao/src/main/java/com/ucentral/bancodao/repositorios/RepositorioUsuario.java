package com.ucentral.bancodao.repositorios;


import com.ucentral.bancodao.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
}
