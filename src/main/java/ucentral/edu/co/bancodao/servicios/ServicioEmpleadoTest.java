package ucentral.edu.co.bancodao.servicios;

import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ucentral.edu.co.bancodao.entidades.Empleado;
import ucentral.edu.co.bancodao.repositorios.RepositorioEmpleado;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ServicioEmpleadoTest {


    @InjectMocks
    private ServicioEmpleado servicioEmpleado;

    @Mock
    private RepositorioEmpleado repositorioEmpleado;

    @Test
    public void testAuntentificar() {
        String usuario = "testUser";
        String contrasena = "testPassword";
        Empleado empleado = new Empleado();
        when(repositorioEmpleado.findByUsuarioEmpleadoAndContrasena(usuario, contrasena)).thenReturn(empleado);

        Empleado result = servicioEmpleado.auntentificar(usuario, contrasena);

        assertEquals(empleado, result);
        verify(repositorioEmpleado, times(1)).findByUsuarioEmpleadoAndContrasena(usuario, contrasena);
    }

}
