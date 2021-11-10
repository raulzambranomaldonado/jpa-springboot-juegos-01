//Modelo
//Interface
//Repositoriio
//Servicios
//Controlador Web

//Games
//Categoria
//Cliente
//Mensaje
//Reservaciones  



package com.example.piamonte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.piamonte.categoria","com.example.piamonte.cliente","com.example.piamonte.mensaje","com.example.piamonte.reservaciones"})
@SpringBootApplication
public class PiamonteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiamonteApplication.class, args);
	}

}
