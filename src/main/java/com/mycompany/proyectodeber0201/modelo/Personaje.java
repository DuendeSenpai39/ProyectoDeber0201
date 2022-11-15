/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.modelo;

/**
 *
 * @author Jose
 */
public class Personaje {
    private int codigo;
    private String nombre;
    private String papel;
    private int edad;
    private int altura;
    private String peliculaActuada;

    public Personaje(int codigo, String nombre, String papel, int edad, int altura, String peliculaActuada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.papel = papel;
        this.edad = edad;
        this.altura = altura;
        this.peliculaActuada = peliculaActuada;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getPeliculasActuadas() {
        return peliculaActuada;
    }

    public void setPeliculasActuadas(String peliculaActuada) {
        this.peliculaActuada = peliculaActuada;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", papel=" + papel + ", edad=" + edad + ", altura=" + altura + ", peliculasActuadas=" + peliculaActuada + '}';
    }
    
}
