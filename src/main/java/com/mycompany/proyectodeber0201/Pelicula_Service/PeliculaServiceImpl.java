/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeber0201.Pelicula_Service;

import com.mycompany.proyectodeber0201.modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class PeliculaServiceImpl implements PeliculaService {
    
    private final List<Pelicula> peliculaList;
    
    public PeliculaServiceImpl(){
    this.peliculaList=new ArrayList<>();
    }

    @Override
    public void crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
    }

    @Override
    public void modificar(int codigo, Pelicula PeliculaModificado) {
         var indice=0;
        for (var pelicula:this.peliculaList){
            if(pelicula.getCodigo()==codigo){
                this.peliculaList.set(indice,PeliculaModificado);
                break;
            }else{
                indice++;
                        
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for (var pelicula:this.peliculaList){
            if(pelicula.getCodigo()==codigo){
                this.peliculaList.remove(indice);
                break;
            }else{
                indice++;
                        
            }
        }
    }
    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }
    
}
