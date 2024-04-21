package models.implementation;

import java.util.Iterator;

import iterator.EmptyIterator;
import models.MenuComponent;

public class MenuOpcion implements MenuComponent {

    private String nombre;

    public MenuOpcion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println(nombre);
    }

    @Override
    public Iterator<MenuComponent> crearIterador() {
        return new EmptyIterator();
    }
    
}
