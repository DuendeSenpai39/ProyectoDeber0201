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
        this.personajeList.add(personaje);
    }

    @Override
    public void modificar(int codigo, Personaje PersonajeModificado) {
        var indice = 0;
        for (var personaje: this.personajeList) {
            if (personaje.getCodigo() == codigo) {
                this.personajeList.set(indice, PersonajeModificado);
                break;
            } else {
                indice++;

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
         var indice = 0;
        for (var personaje: this.personajeList) {
            if (personaje.getCodigo() == codigo) {
                this.personajeList.remove(indice);
                break;
            } else {
                indice++;

            }

        }
    }
    @Override
    public List<Personaje> listar() {
        
        return this.personajeList;
        
    }
    
}
