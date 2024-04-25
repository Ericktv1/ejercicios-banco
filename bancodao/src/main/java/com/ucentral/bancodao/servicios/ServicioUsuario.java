package com.ucentral.bancodao.servicios;


import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.operaciones.OperacionesUsuario;
import com.ucentral.bancodao.repositorios.RepositorioUsuario;
import dto.UsuarioDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ServicioUsuario implements OperacionesUsuario {


    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    RepositorioUsuario repositorioUsuario;

    @Override
    public UsuarioDto crear(UsuarioDto usuarioDto) {
        if (usuarioDto != null) {
            Usuario usuario = repositorioUsuario.save(modelMapper.map(usuarioDto, Usuario.class));
            return modelMapper.map(usuario, UsuarioDto.class);
        } else {
            return null;
        }
    }
}
