/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte.cliente;
//import piamonte.Cliente;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author invitad_o
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
