package lection2.stacks.impl;

import lection2.stacks.interfaces.StackOfGenericItems;

/**
 * SimpleArrayImplementation with fixed array size.
 *
 * Created by dkorolev on 3/12/2016.
 */
public class SimpleArrayImpl<Item> implements StackOfGenericItems<Item> {

    private Item[] s;
    private int n = 0;

    public SimpleArrayImpl(Item[] withCapacity) {
        this.s = withCapacity;
    }


    @Override
    public void push(Item item) {
       s[n++] = item;
    }

    @Override
    public Item pop() {
        return s[--n];
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
