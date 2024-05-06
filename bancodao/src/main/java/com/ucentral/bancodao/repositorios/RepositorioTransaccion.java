package com.ucentral.bancodao.repositorios;

import com.ucentral.bancodao.entidades.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTransaccion extends JpaRepository<Transacciones,Integer> {
}
