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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC1
 */
@ManagedBean
@ViewScoped
public class AltaLibrosFormBean implements Serializable {

    private Libro libro;
    private List<Libro> libros;
    ILibroDao libroDao;

    public AltaLibrosFormBean() {
        libro = new Libro();
        libros = new ArrayList<>();
        libroDao = new LibroDaoImp();
    }

    //el siguiente metodo sera utilizado como ayuda en metodo de agregarUnLibro
    public boolean buscarLibroPorCodigo(String codigo) {  // escribi este codigo como para un auxiliar
        boolean bandera = false;
        for (Libro l : libros) {
            if (l.getCodigo().equals(codigo)) {
                bandera = true;
            }
        }
        return bandera;
    }

    //el siguiente metodo sera utilizado como ayuda en metodo de agregarUnLibro
    public boolean buscarLibroPorIsbn(String isbn) { // escribi este codigo como para un auxiliar
        boolean bandera = false;
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                bandera = true;
            }
        }
        return bandera;
    }

    public void GuardarLibro() {
        boolean existeCodigo = buscarLibroPorCodigo(libro.getCodigo());
        boolean existeIsbn = buscarLibroPorIsbn(libro.getIsbn());

        if ((existeCodigo != true) && (existeIsbn != true)) {
              libroDao.crearLibro(libro);
              System.out.println(libroDao.obtenerLibros().get(0).toString()); //Muestra en consola la primera posicion de la lista para verificar que guardo el libro
              libros = libroDao.obtenerLibros(); //Se Actualiza la lista de libros
                    FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Se agrego correctamente", ""));
        } else{
                    
                    /* if(existeIsbn==true && existeCodigo==true) {
                        FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "El Codigo Y El Isbn Ya Existen", ""));
                     }*/
                     
                     if(existeCodigo==true) {
                        FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "El Codigo Ya Existe", ""));
                    }
                     
                     if(existeIsbn==true) {
                        FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "El Isbn Ya Existe", ""));
                     }
    }
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
