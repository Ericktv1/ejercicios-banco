package ucentral.edu.co.bancodao.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ucentral.edu.co.bancodao.entidades.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {

   Usuario findByNombreUsuario (String nombreUsuario);

    }

