package com.ucentral.bancodao;

import com.ucentral.bancodao.entidades.Usuario;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ucentral.bancodao.repositorios.RepositorioUsuario;

@SpringBootApplication

public class BancodaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancodaoApplication.class, args);
		System.out.println("Proyecto base");
	}




}

