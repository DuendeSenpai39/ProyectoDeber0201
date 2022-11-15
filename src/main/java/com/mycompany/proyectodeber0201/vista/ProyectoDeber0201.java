/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectodeber0201.vista;

import com.mycompany.proyectodeber0201.Controlador_Pelicula.PeliculaControl;
import com.mycompany.proyectodeber0201.Controlador_Personaje.PersonajeControl;

/**
 *
 * @author Jose
 */
public class ProyectoDeber0201 {

    public static void main(String[] args) {
        
       var peliculaControl = new PeliculaControl();
       var datitos = new String[6];
       datitos[0]="1";
       datitos[1]="Titanic";
       datitos[2]="James Cameron";
       datitos[3]="1997";
       datitos[4]="2.202";
       datitos[5]="94%";

       System.out.println("-------------------------------------------------");
       
       var personajeControl = new PersonajeControl();
       var datito = new String[6];
       datito[0]="2";
       datito[1]="Leonardo Dicaprio";
       datito[2]="Jack Dawson";
       datito[3]="48";
       datito[4]="183";
       datito[5]="Titanic";
       
       System.out.print(peliculaControl.crear(datitos));
       System.out.print(personajeControl.crear(datito));
       
    }   
 }   


