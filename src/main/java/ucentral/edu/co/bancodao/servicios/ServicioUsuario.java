package ucentral.edu.co.bancodao.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucentral.edu.co.bancodao.entidades.Usuario;
import ucentral.edu.co.bancodao.operaciones.OperacionesUsuario;
import ucentral.edu.co.bancodao.repositorios.RepositorioUsuario;


@Service

public class ServicioUsuario implements OperacionesUsuario {


    @Autowired
    RepositorioUsuario repositorioUsuario;


    @Override
    public Usuario crear(Usuario usuario) {

        return repositorioUsuario.save(usuario);
    }

    public Usuario findByNombreUsuario(String nombreUsuario) {
        return repositorioUsuario.findByNombreUsuario(nombreUsuario);
    }
}
