/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.modelo;

/**
 *
 * @author Jose
 */
public class Pelicula {
    private String nombre;
    private String director;
    private int year;
    private double recaudacion;
    private String porcentajeAceptacion;

    public Pelicula(String nombre, String director, int year, double recaudacion, String porcentajeAceptacion) {
        this.nombre = nombre;
        this.director = director;
        this.year = year;
        this.recaudacion = recaudacion;
        this.porcentajeAceptacion = porcentajeAceptacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public String getPorcentajeAceptacion() {
        return porcentajeAceptacion;
    }

    public void setPorcentajeAceptacion(String porcentajeAceptacion) {
        this.porcentajeAceptacion = porcentajeAceptacion;
    }

}
