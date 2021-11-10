package com.example.piamonte.categoria;

 
 



import com.example.piamonte.game.Games;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component("category")
@Entity
@Table (name="category") 
public class Categoria {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

   // @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="categoria")
    //@JsonIgnoreProperties("categoria")
    //private List<Games> games;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="category")
    @JsonIgnoreProperties({"category","message"})
    private List<Games> games;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }

    
}
