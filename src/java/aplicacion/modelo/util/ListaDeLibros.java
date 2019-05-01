/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Leo
 */
public class ListaDeLibros implements Serializable{
   
    private List<Libro> listaLibros;

    public ListaDeLibros() {
        listaLibros = new ArrayList<>();

    }

    public void agregarUnLibro(Libro l) {
        listaLibros.add(l);
    }

    public void eliminarUnLibro(Libro l) {
        listaLibros.remove(l);
    }

    public void modificarUnLibro(Libro l, String codigo) {
       for(int i=0;i<listaLibros.size();i++){
           if(listaLibros.get(i).getCodigo().equals(codigo)){
              listaLibros.set(i, l);
           }
       } 
       

    }

    /**
     * @return the listaLibros
     */
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

   
    public Libro buscarLibro(String codigo){
         Libro libroaux=null;
         for(Libro l:listaLibros){
             if(l.getCodigo().equals(codigo)){
                 libroaux=l;
             }
         }
         return libroaux;
    }
    
    
    public void ordenarLibroAsc(){
        listaLibros.sort(Comparator.comparing(Libro::getTitulo));
    }
    
    public List<Libro> buscarLibroPorLetra(char letra){
        List<Libro> listaAux=new ArrayList<>();
        for(int i=0;i<listaLibros.size();i++){
            if(listaLibros.get(i).getTitulo().charAt(0)==letra ){
                listaAux.add(listaLibros.get(i));
            }
        }
        
        return listaAux; 
    }
}
