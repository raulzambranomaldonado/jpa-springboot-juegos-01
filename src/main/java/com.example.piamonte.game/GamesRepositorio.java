 
package com.example.piamonte;

import com.example.piamonte.Games;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 @Repository
public class GamesRepositorio {
    @Autowired
    private InterfaceGames crud;
    public List<Games> getAll(){
        
     return (List<Games>) crud.findAll();
      // List<Games> miListadoDeJuegos = (List<Games>) crud.findAll();
     // return miListadoDeJuegos;
     }
    
    public Optional<Games> getGames(int id){
      return crud.findById(id);
    }
   public Games save(Games games){
      return crud.save(games);
    }
  
 
 }
