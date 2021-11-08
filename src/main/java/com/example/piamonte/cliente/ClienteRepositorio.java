/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte.cliente;

import com.example.piamonte.Games;
import com.example.piamonte.InterfaceCliente;
import com.example.piamonte.InterfaceGames;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author invitad_o
 */
 
@Repository
public class ClienteRepositorio {
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