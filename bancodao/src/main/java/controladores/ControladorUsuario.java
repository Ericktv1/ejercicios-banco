package controladores;

import com.ucentral.bancodao.servicios.ServicioUsuario;
import dto.UsuarioDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Log4j2
@Controller
public class ControladorUsuario {
    @Autowired
    ServicioUsuario serviciosUsuario;

    @PostMapping("/registrar")
    public String registrarUsuario(@RequestBody UsuarioDto usuarioDto){
        serviciosUsuario.crear(usuarioDto);
        return "redirect:/inicio"; // O la página a la que desees redirigir después de registrar
    }
}
