package lection2.stacks.impl;

import lection2.stacks.interfaces.StackOfGenericItems;

/**
 * SimpleArrayImplementation with fixed array size.
 *
 * Created by dkorolev on 3/12/2016.
 */
public class SimpleArrayImpl<Item> implements StackOfGenericItems<Item> {

    private Item[] a;
    private int n = 0;

    public SimpleArrayImpl(int capacity) {
        this.a = (Item[]) new Object[capacity];
    }


    @Override
    public void push(Item item) {
       a[n++] = item;
    }

    @Override
    public Item pop() {
//        return a[--n];
        Item item = a[--n]; //better approach to
        a[n] = null;        //allow garbage collector
        return item;        //to reclaim memory.

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
