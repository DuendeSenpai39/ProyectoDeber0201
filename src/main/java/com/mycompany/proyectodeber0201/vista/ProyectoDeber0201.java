/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectodeber0201.vista;

import com.mycompany.proyectodeber0201.Controlador_Pelicula.PeliculaControl;

/**
 *
 * @author Jose
 */
public class ProyectoDeber0201 {

    public static void main(String[] args) {
        
       var peliculaControl = new PeliculaControl();
       var datitos = new String[5];
       datitos[0]="10";
       datitos[1]="";
       datitos[2]="";
       datitos[3]="";
       datitos[4]="";

       
       System.out.print(peliculaControl.crear(datitos));
       
    }   
}   

