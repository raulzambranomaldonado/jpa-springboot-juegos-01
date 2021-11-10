/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piamonte.game;


import com.example.piamonte.categoria.Categoria;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.example.piamonte.mensaje.Mensaje;
import com.example.piamonte.reservaciones.Reservacion;
import org.springframework.stereotype.Component;

/**
 *
 * @author invitad_o
 */
@Component("game")
@Entity
@Table(name="game")
public class Games {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@GeneratedValue
    private Integer idGames;
    private String developer;
    private Integer year;  
    private String name;
    private String description;
    
    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("category")
    private Categoria  category;

     @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "game")
    @JsonIgnoreProperties({"game","client"})
    private List<Mensaje> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "game")
    @JsonIgnoreProperties({"game","messages"})
    public List<Reservacion> reservations;

    public Integer getIdGames() {
        return idGames;
    }

    public void setIdGames(Integer idGames) {
        this.idGames = idGames;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    public List<Reservacion> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }

     

    
}
