package com.BatallaAerea.AirForceOne.service;

import com.BatallaAerea.AirForceOne.ValueObjects.UserDTO;
import com.BatallaAerea.AirForceOne.persistence.entities.User;
import com.BatallaAerea.AirForceOne.persistence.repositories.UserRespository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    private UserRespository respository;

    public UserService(UserRespository respository){
        this.respository = respository;
    }


    public UserDTO obtenerUsuario(String nickname){
        User user = respository.findByNombrePute(nickname);
        return new UserDTO(
                user.getNombrePute(),
                user.getApellidoPute()
        );
    }

    public Boolean guardarUsuario(String nombre, String apellido){
        User user = new User(
                null,
                nombre,
                apellido
        );
        respository.save(user);
        return true;
    }

}
