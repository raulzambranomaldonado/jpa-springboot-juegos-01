 
 
package com.example.piamonte.mensaje;

import com.example.piamonte.Games;
import com.example.piamonte.GamesRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author invitad_o
 */
@Service
public class ServiciosMensaje {
    @Autowired
    private RepositorioMensaje metodosCrud;
    
    public List<Mensaje> getAll(){
      return metodosCrud.getAll();
      
    }
    
    public Optional<Mensaje> getMensaje(int idMensaje){
        return metodosCrud.getMensaje(idMensaje);
    }
    
    public Mensaje save(Mensaje mensaje){
        if(mensaje.getIdMessage()==null){
            return metodosCrud.save(mensaje);
        }else{
            Optional<Mensaje> evt=metodosCrud.getMensaje(mensaje.getIdMessage());
            if(evt.isEmpty()){
                return metodosCrud.save(mensaje);
            }else{
                return mensaje;
            }
        }
        
    }
    
}
