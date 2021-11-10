 
package com.example.piamonte.mensaje;



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

@RestController
@RequestMapping("/api/Message")
public class MensajeWeb {
     
   
    @GetMapping("/holaMundo")
    public String hola(){
      return "hola mensaje";    
    }
    
    @Autowired
    private ServiciosMensaje servicios;
    @GetMapping("all")
    public List<Mensaje> getAll(){
        return servicios.getAll();
    }
 

@GetMapping("/{id}")
public Optional<Mensaje> getGames(@PathVariable("id") int idMensaje){
return servicios.getMensaje(idMensaje);
}

@PostMapping("/all")
@ResponseStatus(HttpStatus.CREATED)
public Mensaje save(@RequestBody Mensaje mensaje){
    System.out.print("message");
        System.out.print(mensaje);
         
  //return games;
   return servicios.save(mensaje);
}
}