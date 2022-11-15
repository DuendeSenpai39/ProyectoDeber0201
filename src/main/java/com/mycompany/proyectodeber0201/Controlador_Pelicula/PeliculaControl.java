/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.Controlador_Pelicula;

import com.mycompany.proyectodeber0201.Pelicula_Service.PeliculaServiceImpl;
import com.mycompany.proyectodeber0201.modelo.Pelicula;

/**
 *
 * @author Jose
 */
public class PeliculaControl {
    
    private final PeliculaServiceImpl peliculaServiceImpl;

    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();
    }
    
    public String crear(String[] data){
        var retorno="Nose sabe la pelicula";
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var director=data[2];
        var year=Integer.valueOf(data[3]);
        var recaudacion = Double.valueOf(data[4]);
        var porcentajeAceptacion = data[5]
                ;
        if (recaudacion<0){
            retorno+= "No valido";
           
        }else{
            if(year<0){
            retorno+="No valido";
            }
        }
        var pelicula = new Pelicula(codigo,nombre,director,year,recaudacion,porcentajeAceptacion);
        this.peliculaServiceImpl.crear(pelicula);
        retorno ="Pelicula"+pelicula.getNombre()+" creado correctamente";
        return retorno;
    }

    }
