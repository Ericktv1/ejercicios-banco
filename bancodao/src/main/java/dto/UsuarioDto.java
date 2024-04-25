package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



public class UsuarioDto implements Serializable {
    private String nombreUsuario;
    private String contrasena;
}
