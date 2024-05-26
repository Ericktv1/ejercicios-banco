package ucentral.edu.co.bancodao.operaciones;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ucentral.edu.co.bancodao.entidades.Transacciones;


public interface OperacionesTransacciones {
    Transacciones crear(Transacciones transacciones);
    Transacciones actualizar(Transacciones transacciones);
    void borrar(Transacciones transacciones);
    Page<Transacciones> consultarT(Pageable pageable);
    Transacciones consultarPk(int pk);
}
