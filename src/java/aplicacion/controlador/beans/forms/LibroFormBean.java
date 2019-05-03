/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.interfaces.dao.ILibroDao;
import aplicacion.interfaces.dao.imp.LibroDaoImp;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaDeAutores;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC1
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable {

    private Libro libro;
    private List<Libro> libros;
    ILibroDao libroDao;
    

    public LibroFormBean() {
        libro = new Libro();
        libros = new ArrayList<>();
        libroDao = new LibroDaoImp();
    }

    public void GuardarLibro() {
        libroDao.crearLibro(libro);
        System.out.println(libroDao.obtenerLibros().get(0).toString()); //Muestra en consola la primera posicion de la lista para verificar que guardo el libro
        libros=libroDao.obtenerLibros(); //Se Actualiza la lista de libros
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
    

}
