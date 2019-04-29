package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author PC1
 */
public class Libro {

    private String codigo;
    private String isbn;
    private String titulo;
    private int cantidadPag;
    private String autor;
    private String tematica;
    private Date fechaEdicion;

    public Libro(String codigo, String isbn, String titulo, int cantidadPag, String autor, String tematica, Date fechaEdicion) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.cantidadPag = cantidadPag;
        this.autor = autor;
        this.tematica = tematica;
        this.fechaEdicion = fechaEdicion;
    }

    public Libro() {
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cantidadPag
     */
    public int getCantidadPag() {
        return cantidadPag;
    }

    /**
     * @param cantidadPag the cantidadPag to set
     */
    public void setCantidadPag(int cantidadPag) {
        this.cantidadPag = cantidadPag;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tematica
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * @param tematica the tematica to set
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    /**
     * @return the fechaEdicion
     */
    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * @param fechaEdicion the fechaEdicion to set
     */
    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", cantidadPag=" + cantidadPag + ", autor=" + autor + ", tematica=" + tematica + ", fechaEdicion=" + fechaEdicion + '}';
    }

}
