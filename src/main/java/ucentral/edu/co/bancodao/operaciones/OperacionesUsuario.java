package ucentral.edu.co.bancodao.operaciones;


import ucentral.edu.co.bancodao.entidades.Usuario;

public interface OperacionesUsuario {
   public Usuario crear(Usuario usuario);
   public Usuario findByNombreUsuario(String nombreUsuario);
}
