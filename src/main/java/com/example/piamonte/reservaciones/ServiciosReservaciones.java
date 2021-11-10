 

 
 
package com.example.piamonte.reservaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author invitad_o
 */
@Service
public class ServiciosReservaciones {
    @Autowired
    private RepositorioReservaciones metodosCrud;
    
    public List<Reservacion> getAll(){
      return metodosCrud.getAll();
      
    }
    
    public Optional<Reservacion> getReservacion(int idReservacion){
        return metodosCrud.getReservacion(idReservacion);
    }
    
    public Reservacion save(Reservacion reservacion){
        if(reservacion.getIdReservation()==null){
            return metodosCrud.save(reservacion);
        }else{
            Optional<Reservacion> evt=metodosCrud.getReservacion(reservacion.getIdReservation());
            if(evt.isEmpty()){
                return metodosCrud.save(reservacion);
            }else{
                return reservacion;
            }
        }
        
    }
    
}