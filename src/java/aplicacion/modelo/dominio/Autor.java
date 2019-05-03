
package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *Es un Autor de un Libro
 * @author 
 */
public class Autor {
    /**
     * Codigo unico para cada autor
     */
    private Integer codigo;
    /**
     * Apellido del autor
     */
    private String apellido;
    /**
     * Nombre del Autor
     */
    private String Nombre;
    /**
     * Contructor por defecto
     */
    public Autor() {
    }

    public Autor(Integer codigo, String apellido, String Nombre) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.Nombre = Nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
    
    
}
