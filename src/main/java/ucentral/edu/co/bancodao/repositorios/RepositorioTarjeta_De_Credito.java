package ucentral.edu.co.bancodao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucentral.edu.co.bancodao.entidades.Tarjeta_De_Credito;

@Repository
public interface RepositorioTarjeta_De_Credito extends JpaRepository<Tarjeta_De_Credito, Integer> {
    Tarjeta_De_Credito findByNumeroTarjeta(String numeroTarjeta);
}
