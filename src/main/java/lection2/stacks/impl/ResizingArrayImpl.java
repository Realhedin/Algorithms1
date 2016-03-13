package lection2.stacks.impl;

import lection2.stacks.interfaces.StackOfGenericItems;

import java.util.Iterator;

/**
 * Resizing array stack implementation.
 *
 * Created by dkorolev on 3/13/2016.
 */
public class ResizingArrayImpl<Item> implements StackOfGenericItems<Item>, Iterable<Item> {


    private Item[] a;
    private int n = 0;

    public ResizingArrayImpl() {
        this.a = (Item[]) new Object[2];
    }


    @Override
    public void push(Item item) {
        if (n == a.length) {
           resize(a.length * 2);
        }
        a[n++] = item;
    }

    /**
     * Method to resize size of array.
     * @param capacity of the array.
     */
    private void resize(int capacity) {
        Item[] newCopy = (Item[]) new Object[capacity];
        System.arraycopy(a,0,newCopy,0,n);
        a = newCopy;
    }

    @Override
    public Item pop() {
        Item item = a[--n]; //better approach to allow GC
        a[n] = null;        ///to reclaim memory.
        //if array is 1/4 full, then halve size.
        if (n > 0 && n == a.length / 4) {
            resize(a.length/2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }


    /**
     * iterator implementation.
     * @return new ListIterator object.
     */
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {

        private int i = n;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
