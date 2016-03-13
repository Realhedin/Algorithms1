package lection2.stacks.impl;

import lection2.stacks.interfaces.StackOfGenericItems;

/**
 * Resizing array stack implementation.
 *
 * Created by dkorolev on 3/13/2016.
 */
public class ResizingArrayImpl<Item> implements StackOfGenericItems<Item> {


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
        System.arraycopy(a,0,newCopy,0,a.length);
        a = newCopy;
    }

    @Override
    public Item pop() {
        return a[--n];
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }
}
