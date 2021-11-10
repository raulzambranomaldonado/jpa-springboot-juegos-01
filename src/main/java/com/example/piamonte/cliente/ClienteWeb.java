  
package com.example.piamonte.cliente;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/Client")
public class ClienteWeb {
     
   
    @GetMapping("/holaMundo")
    public String hola(){
      return "hola";    
    }
    
    @Autowired
    private ServiciosCliente servicios;
    @GetMapping("/all")
    public List<Cliente> getAll(){
        return servicios.getAll();
    }
 

@GetMapping("/{id}")
public Optional<Cliente> getCliente(@PathVariable("id") int idCliente){
return servicios.getCliente(idCliente);
}

 @RequestMapping(value = "all", produces = "application/json", 
  method = RequestMethod.POST)
@ResponseStatus(HttpStatus.CREATED)
public Cliente save(@RequestBody Cliente cliente){
    System.out.print("cliente");
        System.out.print(cliente);
         
  //return games;
   return servicios.save(cliente);
}
}