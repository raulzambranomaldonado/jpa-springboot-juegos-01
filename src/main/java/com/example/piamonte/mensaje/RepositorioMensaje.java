 
 
package com.example.piamonte.mensaje;

import com.example.piamonte.Games;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 @Repository
public class RepositorioMensaje {
    @Autowired
    private InterfaceMensaje crud;
    public List<Mensaje> getAll(){
        
      List<Mensaje> miListadoDeJuegos = (List<Mensaje>) crud.findAll();
      return miListadoDeJuegos;
     }
    
    public Optional<Mensaje> getMensaje(int id){
      return crud.findById(id);
    }
    public Mensaje save(Mensaje mensaje){
      return crud.save(mensaje);
    }
}
