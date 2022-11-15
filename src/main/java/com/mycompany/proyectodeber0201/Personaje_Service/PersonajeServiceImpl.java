/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.Personaje_Service;

import com.mycompany.proyectodeber0201.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class PersonajeServiceImpl implements PersonajeService {
    
    private final List<Personaje> personajeList;
    
    public PersonajeServiceImpl(){
    this.personajeList=new ArrayList<>();
    }

    @Override
    public void crear(Personaje personaje) {
        
    }

    @Override
    public void modificar(int codigo, Personaje PersonajeModificado) {
        
    }

    @Override
    public void eliminar(int codigo) {
        
    }
    @Override
    public List<Personaje> listar() {
        
        return this.personajeList;
        
    }
    
}
