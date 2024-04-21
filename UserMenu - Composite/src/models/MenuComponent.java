package models;

import java.util.Iterator;

public interface MenuComponent {
    void mostrar();

    Iterator<MenuComponent> crearIterador();
}
