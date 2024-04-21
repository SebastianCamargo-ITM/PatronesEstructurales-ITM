package iterator;

import java.util.Iterator;

import models.MenuComponent;

public class MenuCompuestoIterator implements Iterator<MenuComponent> {

    private Iterator<MenuComponent> iterator;

    public MenuCompuestoIterator(Iterator<MenuComponent> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuComponent next() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }

}
