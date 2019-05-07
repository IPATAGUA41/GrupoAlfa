/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.dominio.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo Alfa
 */
public class ListaDeAutores {
    private List<Autor> Autores;

    public ListaDeAutores() {
        Autores= new ArrayList<>();
        Autor autor1 = new Autor(1,"Garcia Marquez","Gabriel");
        Autores.add(autor1);
        Autor autor2 = new Autor(1,"Poe","Edgar Alan");
        Autores.add(autor2);
        Autor autor3 = new Autor(1,"Cortazar","Julio");
        Autores.add(autor3);
        Autor autor4 = new Autor(1,"Neruda","Pablo");
        Autores.add(autor4);
        
    }

    public List<Autor> getAutores() {
        return Autores;
    }

    public void setAutores(List<Autor> Autores) {
        this.Autores = Autores;
    }
    
}
