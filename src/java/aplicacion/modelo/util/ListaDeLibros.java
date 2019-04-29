/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class ListaDeLibros implements Serializable{
   
    List<Libro> libros;
    public ListaDeLibros() {
        libros=new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void AgregarUnLibro(Libro nuevoLibro){
       libros.add(nuevoLibro);
    }
}
