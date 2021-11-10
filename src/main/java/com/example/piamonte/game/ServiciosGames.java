 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte.game;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author invitad_o
 */
@Service
public class ServiciosGames {
    @Autowired
    private GamesRepositorio metodosCrud;
    
    public List<Games> getAll(){
      return metodosCrud.getAll();
      
    }
    
    public Optional<Games> getGames(int idGames){
        return metodosCrud.getGames(idGames);
    }
    
    public Games save(Games games){
        if(games.getId()==null){
            return metodosCrud.save(games);
        }else{
            Optional<Games> evt=metodosCrud.getGames(games.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(games);
            }else{
                return games;
            }
       }
        
    }
    
 
   

}
