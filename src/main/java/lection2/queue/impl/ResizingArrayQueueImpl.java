package lection2.queue.impl;

import lection2.queue.interfaces.QueueOfGenericItems;

import java.util.NoSuchElementException;

/**
 * Resizing array of queue implementation.
 *
 * Created by dkorolev on 3/13/2016.
 */
public class ResizingArrayQueueImpl<Item> implements QueueOfGenericItems<Item> {

    private Item[] a;   //array
    private int n;      //size
    private int first;  //pointer to first element
    private int last;   //pointer to last element


    public ResizingArrayQueueImpl() {
        this.a = (Item[]) new Object[2];
        n = 0;
        first = 0;
        last = 0;
    }

    /**
     * change size of underlying array.
     * @param capacity - new size of array.
     */
    public void resize(int capacity) {
        Item[] newCopy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            newCopy[i] = a[(first + i) % a.length];
        }
        a = newCopy;
        first = 0;
        last = n;
    }

    @Override
    public void enqueue(Item item) {
        if (n == a.length) {
            resize(a.length * 2);
        }
        a[last++] = item;
        n++;
    }

    @Override
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        Item item = a[first];
        a[first] = null;
        n--;
        first++;
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
}
