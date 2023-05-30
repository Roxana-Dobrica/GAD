package DesignPatterns.Iterator;

import java.util.NoSuchElementException;


public class ArrayCustomIterator {
    private int[] array;
    private int currentIndex;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < array.length;
    }

    public int next() {
        if (hasNext()) {
            int nextValue = array[currentIndex];
            currentIndex++;
            return nextValue;
        }
        throw new NoSuchElementException("No more elements in the array.");
    }
}
