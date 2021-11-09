 
 
package com.example.piamonte.cliente;

import com.example.piamonte.Games;
import com.example.piamonte.cliente.Cliente;
import com.example.piamonte.cliente.InterfaceCliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 @Repository
public class RepositorioCliente {
    @Autowired
    private InterfaceCliente crud;
    public List<Cliente> getAll(){
        
      List<Cliente> miListadoDeJuegos = (List<Cliente>) crud.findAll();
      return miListadoDeJuegos;
     }
    
    public Optional<Cliente> getCliente(int id){
      return crud.findById(id);
    }
    public Cliente save(Cliente cliente){
      return crud.save(cliente);
    }
}
