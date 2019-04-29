
package aplicacion.interfaces.dao;

import aplicacion.modelo.dominio.Libro;
import java.util.List;

/**
 *
 * @author GRUPO ALFA
 */
public interface ILibroDao {
    
    void crearLibro(Libro libro);
    List<Libro> obtenerLibros();
    void modificarLibro(Libro libro, String codigo);
    void eliminarLibro(Libro libro);
    Libro buscarLibro(String codigo); 
    void ordenarLibroAscendente();
    void ordenarLibroDescendente();
    List<Libro> buscarLibroporLetra(char letra);
}
