/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte;

import com.example.piamonte.Categoria;
import com.example.piamonte.ServiciosCategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author invitad_o
 */
@RestController
@RequestMapping("/api/Category")
public class CategoriasWeb {
    @GetMapping("/holaMundos")
    public String hola(){
      return "hola raul ";    
    }
    
     @Autowired
    private ServiciosCategoria servicios;
    @GetMapping("all")
    public List<Categoria> getAll(){
        return servicios.getAll();
    }
 
    @GetMapping("/{id}")
public Optional<Categoria> getCategoria(@PathVariable("id") int idCategoria){
return servicios.getCategoria(idCategoria);
}

@PostMapping("/save")
@ResponseStatus(HttpStatus.CREATED)
public Categoria save(@RequestBody Categoria categoria){
    System.out.print("categoria");
        System.out.print(categoria);
         
  //return games;
   return servicios.save(categoria);
}

}
