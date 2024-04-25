package com.ucentral.bancodao;

import com.ucentral.bancodao.entidades.Usuario;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repositorios.RepositorioUsuario;

@SpringBootApplication
@Log4j2
public class BancodaoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BancodaoApplication.class, args);
		System.out.println("Proyecto base");
	}
	@Autowired
	RepositorioUsuario repoUsuario;
	@Override
	public void run(String...args)throws Exception{
		Usuario usuario=new Usuario();
		usuario.setNombreUsuario("erick");
		usuario.setContrasena("12345");
	}



}

