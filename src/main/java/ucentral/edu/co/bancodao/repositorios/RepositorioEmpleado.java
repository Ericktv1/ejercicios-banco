package ucentral.edu.co.bancodao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucentral.edu.co.bancodao.entidades.Empleado;

@Repository
public interface RepositorioEmpleado extends JpaRepository<Empleado,Integer> {
    Empleado findByUsuarioEmpleadoAndContrasena(String usuarioEmpleado, String contrasena);
}
