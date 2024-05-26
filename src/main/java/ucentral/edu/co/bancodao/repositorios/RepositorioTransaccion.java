package ucentral.edu.co.bancodao.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ucentral.edu.co.bancodao.entidades.Transacciones;

public interface RepositorioTransaccion extends JpaRepository<Transacciones,Integer> {
}
