package com.ucentral.bancodao.operaciones;

import com.ucentral.bancodao.entidades.Transacciones;

import java.util.List;

public interface OperacionesTransacciones {
    public Transacciones crear(Transacciones transacciones);
    public Transacciones actualizar(Transacciones transacciones);
    public void borrar(Transacciones transacciones);
    public List<Transacciones> consultarT();
    public Transacciones consultarPk(int pk);
}
