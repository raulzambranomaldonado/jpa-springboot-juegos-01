 
 
package com.example.piamonte.reservaciones;


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
@RequestMapping("/api/reservacion")
public class ReservacionesWeb {
     
   
    @GetMapping("/holaMundo")
    public String hola(){
      return "hola mensaje";    
    }
    
    @Autowired
    private ServiciosReservaciones servicios;
    @GetMapping("all")
    public List<Reservacion> getAll(){
        return servicios.getAll();
    }
 

@GetMapping("/{id}")
public Optional<Reservacion> getRservacion(@PathVariable("id") int idReservacion){
return servicios.getReservacion(idReservacion);
}

@PostMapping("/save")
@ResponseStatus(HttpStatus.CREATED)
public Reservacion save(@RequestBody Reservacion reservacion){
    System.out.print("reservacion");
        System.out.print(reservacion);
         
  //return games;
   return servicios.save(reservacion);
}
}

