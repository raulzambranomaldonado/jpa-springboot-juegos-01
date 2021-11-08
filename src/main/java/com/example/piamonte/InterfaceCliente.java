 
package com.example.piamonte;

import com.example.piamonte.cliente.Cliente;
import org.springframework.data.repository.CrudRepository;

 
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}   