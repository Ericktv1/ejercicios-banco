package com.ucentral.bancodao;

import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancodaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancodaoApplication.class, args);
		System.out.println("Proyecto base");
	}

	@Autowired
	RepositorioUsuario repositorioUsuario;


	public void run(String... args) throws Exception {
		// Ejemplo de creación de usuarios
		Usuario usuario1 = new Usuario();
		usuario1.setNombreUsuario("usuario1");
		usuario1.setContrasena("contrasena1");

		Usuario usuario2 = new Usuario();
		usuario2.setNombreUsuario("usuario2");
		usuario2.setContrasena("contrasena2");

		// Guardar usuarios en la base de datos
		Usuario usuarioGuardado1 = repositorioUsuario.save(usuario1);
		Usuario usuarioGuardado2 = repositorioUsuario.save(usuario2);

		System.out.println("Usuarios registrados:");
		System.out.println(usuarioGuardado1.getNombreUsuario());
		System.out.println(usuarioGuardado2.getNombreUsuario());
	}
}

