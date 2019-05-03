
package aplicacion.interfaces.dao.imp;

import aplicacion.interfaces.dao.ILibroDao;
import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.util.ListaDeLibros;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leo
 */
public class LibroDaoImp implements Serializable, ILibroDao{
    private ListaDeLibros lista;

    
    public LibroDaoImp(){
        lista = new ListaDeLibros();     
    }
    
    @Override
    public void crearLibro(Libro libro) {
        
       lista.agregarUnLibro(libro);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return lista.getListaLibros(); 
    }

    @Override
    public void eliminarLibro(Libro libro) {
        lista.eliminarUnLibro(libro);
     }

    @Override
    public Libro buscarLibro(String codigo) {
        return lista.buscarLibro(codigo);
   }

    @Override
    public void modificarLibro(Libro libro, String codigo) {
        lista.modificarUnLibro(libro, codigo);
    }

    @Override
    public void ordenarLibroAscendente() {
        lista.ordenarLibroAsc();
 }

    @Override
    public void ordenarLibroDescendente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Libro> buscarLibroporLetra(char letra) {
     return lista.buscarLibroPorLetra(letra);
    }
    
}
