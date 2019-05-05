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
public class ListaDeLibros implements Serializable {

    private List<Libro> listaLibros;

    public ListaDeLibros() {
        listaLibros = new ArrayList<>();

    }
       //el siguiente metodo sera utilizado como ayuda en metodo de agregarUnLibro
    public boolean buscarLibroPorCodigo(String codigo) {
        boolean bandera=false;
        for (Libro l : listaLibros) {
            if (l.getCodigo().equals(codigo)) {
                bandera=true;
            }
        }
        return bandera;
    }
    
    //el siguiente metodo sera utilizado como ayuda en metodo de agregarUnLibro
    public boolean buscarLibroPorIsbn(String isbn) {
        boolean bandera=false;
        for (Libro l : listaLibros) {
            if (l.getIsbn().equals(isbn)) {
                bandera=true;
            }
        }
        return bandera;
    }
    
    public void agregarUnLibro(Libro l) {
        boolean existeCodigo=buscarLibroPorCodigo(l.getCodigo());
        boolean existeIsbn=buscarLibroPorIsbn(l.getIsbn());
        
        if((existeCodigo!=true) && (existeIsbn!=true)){
             Libro libroAuxiliar= new Libro(); //Se crea el libro auxiliar para que no tenga problemas con las referencias
             libroAuxiliar.setCodigo(l.getCodigo());
             libroAuxiliar.setIsbn(l.getIsbn());
             libroAuxiliar.setTitulo(l.getTitulo());
             libroAuxiliar.setCantidadPag(l.getCantidadPag());
             libroAuxiliar.setAutor(l.getAutor());
             libroAuxiliar.setTematica(l.getTematica());
             libroAuxiliar.setFechaEdicion(l.getFechaEdicion());
             listaLibros.add(libroAuxiliar);}
     /*   else{
        en la pagina se debe mostrar un mensaje que diga que el codigo ya exite
        o bien que el isbn ya exiteS
        }**/
    }

    public void eliminarUnLibro(Libro l) {
        listaLibros.remove(l);
    }

    public void modificarUnLibro(Libro l, String codigo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getCodigo().equals(codigo)) {
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

    public Libro buscarLibro(String codigo) {
        Libro libroaux = null;
        for (Libro l : listaLibros) {
            if (l.getCodigo().equals(codigo)) {
                libroaux = l;
            }
        }
        return libroaux;
    }

    public void ordenarLibroAsc() {
        listaLibros.sort(Comparator.comparing(Libro::getTitulo));
    }

    public List<Libro> buscarLibroPorLetra(char letra) {
        List<Libro> listaAux = new ArrayList<>();
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().charAt(0) == letra) {
                listaAux.add(listaLibros.get(i));
            }
        }

        return listaAux;
    }
}
