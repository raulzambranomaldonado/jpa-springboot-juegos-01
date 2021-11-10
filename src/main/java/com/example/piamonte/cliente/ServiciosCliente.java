 
package com.example.piamonte.cliente;
 

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author invitad_o
 */
@Service
public class ServiciosCliente {
    @Autowired
    private RepositorioCliente metodosCrud;
    
    public List<Cliente> getAll(){
      return metodosCrud.getAll();
      
    }
    
    public Optional<Cliente> getCliente(int idCliente){
        return metodosCrud.getCliente(idCliente);
    }
    
    public Cliente save(Cliente cliente){
        if(cliente.getIdClient()==null){
            return metodosCrud.save(cliente);
        }else{
            Optional<Cliente> evt=metodosCrud.getCliente(cliente.getIdClient());
            if(evt.isEmpty()){
                return metodosCrud.save(cliente);
            }else{
                return cliente;
            }
        }
        
    }
    
}
