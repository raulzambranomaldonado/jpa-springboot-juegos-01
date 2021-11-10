 
package com.example.piamonte.reservaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 @Repository
public class RepositorioReservaciones {
    @Autowired
    private InterfaceReservaciones crud;
    public List<Reservacion> getAll(){
        
      List<Reservacion> miListadoDeJuegos = (List<Reservacion>) crud.findAll();
      return miListadoDeJuegos;
     }
    
    public Optional<Reservacion> getReservacion(int id){
      return crud.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
      return crud.save(reservacion);
    }
}
