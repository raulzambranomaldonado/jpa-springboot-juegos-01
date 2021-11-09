/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte;


import com.example.piamonte.Games;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Game")
public class GamesWeb {
     
   
    @GetMapping("/holaMundo")
    public String hola(){
      return "hola";    
    }
    
    @Autowired
    private ServiciosGames servicios;
    @GetMapping("all")
    public List<Games> getAll(){
        return servicios.getAll();
    }
 

@GetMapping("/{id}")
public Optional<Games> getGames(@PathVariable("id") int idGames){
return servicios.getGames(idGames);
}

@PostMapping("/save")
@ResponseStatus(HttpStatus.CREATED)
public Games save(@RequestBody Games games){
    System.out.print("game");
        System.out.print(games);
         
  //return games;
   return servicios.save(games);
}



}