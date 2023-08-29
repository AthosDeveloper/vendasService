package com.catalisa.vendas.controller;

import com.catalisa.vendas.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/usuarios")
public class UsuarioController {
   @GetMapping
    public ResponseEntity<Usuario> listarTodos(){
        Usuario usuario = new Usuario(1L, "maria", "marialuisa@gmail.com", "12312312", "198");
   return ResponseEntity.ok().body(usuario);
    }
}
