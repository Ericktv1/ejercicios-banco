package ucentral.edu.co.bancodao.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import ucentral.edu.co.bancodao.entidades.Solicitud;

public interface RepositorioSolicitud extends JpaRepository<Solicitud,Integer> {
    Solicitud findTopByOrderByFechaCreacionDesc();
    Solicitud findByCodigo(int codigo);
}
