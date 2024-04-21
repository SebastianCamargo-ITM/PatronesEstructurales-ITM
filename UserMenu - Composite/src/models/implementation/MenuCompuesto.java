package models.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.MenuCompuestoIterator;
import models.MenuComponent;

public class MenuCompuesto implements MenuComponent {

    private String nombre;
    private List<MenuComponent> opciones;

    public MenuCompuesto(String nombre) {
        this.nombre = nombre;
        this.opciones = new ArrayList<>();
    }

    public void agregar(MenuComponent opcion) {
        opciones.add(opcion);
    }

    @Override
    public void mostrar() {
        System.out.println("\n--------------------------");
        System.out.println(nombre);
        System.out.println("--------------------------");
    }

    @Override
    public Iterator<MenuComponent> crearIterador() {
        return new MenuCompuestoIterator(opciones.iterator());
    }

}
