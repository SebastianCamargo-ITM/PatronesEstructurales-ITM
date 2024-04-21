package iterator;

import java.util.Iterator;

import models.MenuComponent;

public class EmptyIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
    
}
