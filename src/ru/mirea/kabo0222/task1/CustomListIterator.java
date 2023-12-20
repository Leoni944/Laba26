package ru.mirea.kabo0222.task1;

import java.util.Iterator;
import java.util.List;

public class CustomListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int currentIndex;

    public CustomListIterator(List<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        return list.get(currentIndex++);
    }
}
