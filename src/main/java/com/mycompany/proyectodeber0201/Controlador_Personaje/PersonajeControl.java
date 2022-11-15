/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.Controlador_Personaje;

import com.mycompany.proyectodeber0201.Personaje_Service.PersonajeServiceImpl;
import com.mycompany.proyectodeber0201.modelo.Personaje;

/**
 *
 * @author Jose
 */
public class PersonajeControl {
    
    private final PersonajeServiceImpl personajeServiceImpl;

    public PersonajeControl() {
        this.personajeServiceImpl = new PersonajeServiceImpl();
    }
    
    public String crear(String[] data){
        var retorno="Nose sabe el actor";
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var papel=data[2];
        var edad=Integer.valueOf(data[3]);
        var altura=Integer.valueOf(data[4]);
        var peliculaActuada = data[5];
        
        if (altura<0){
            retorno+= "No valido";
           
        }else{
            if(altura<0){
            retorno+="No valido";
            }
        }
        var personaje = new Personaje(codigo,nombre,papel,edad,altura,peliculaActuada);
        this.personajeServiceImpl.crear(personaje);
        retorno ="Pelicula"+personaje.getNombre()+" creado correctamente";
        return retorno;
    }
    }
