package com.BatallaAerea.AirForceOne.controller;

import com.BatallaAerea.AirForceOne.ValueObjects.UserDTO;
import com.BatallaAerea.AirForceOne.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    private UserService userService;

    public HelloWorldController(UserService userService) {

        this.userService = userService;
    }

    @RequestMapping("/gonzaLlegasteTarde")
    public String saludoAGonza() {

        return "PA GONZA LLEGASTE TARDE!!";
    }

    @RequestMapping("/saveUser/{name}/{last_name}")
    public String saveUser(
            @PathVariable String name,
            @PathVariable String last_name
    ) {
        if (userService.guardarUsuario(name, last_name)) {
            return "SE GUARDO TODO BIEN";
        } else {
            return "GUARDA PORQUE SE ROMPIÓ ALGO";
        }
    }

    @RequestMapping("/getUser/{nickname}")
    public UserDTO retreiveUser(
            @PathVariable String nickname
    ) {
        return userService.obtenerUsuario(nickname);
    }

    @PostMapping("/saveUser")
    public String saveUser(
            @RequestBody UserDTO user
    ){
        if (userService.guardarUsuario(
                user.getNombre(),
                user.getApellido())) {
            return "SE GUARDO TODO BIEN";
        } else {
            return "GUARDA PORQUE SE ROMPIÓ ALGO";
        }
    }
}
