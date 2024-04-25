package com.ucentral.bancodao.servicios;


import com.ucentral.bancodao.entidades.Usuario;
import com.ucentral.bancodao.operaciones.OperacionesUsuario;
import dto.UsuarioDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorios.RepositorioUsuario;


@Service
@AllArgsConstructor
public class ServicioUsuario implements OperacionesUsuario {


    private ModelMapper modelMapper = new ModelMapper();

    private final RepositorioUsuario repoUsuario;

    public UsuarioDto crear(UsuarioDto usuarioDto) {

            Usuario elUsuario = repoUsuario.save(modelMapper.map(usuarioDto, Usuario.class));
            return modelMapper.map(elUsuario, UsuarioDto.class);
        }
    }

