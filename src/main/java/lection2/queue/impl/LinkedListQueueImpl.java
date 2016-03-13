package lection2.queue.impl;

import lection2.queue.interfaces.QueueOfGenericItems;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  Linked list implementation of queue.
 *
 * Created by dkorolev on 3/13/2016.
 */
public class LinkedListQueueImpl<Item> implements QueueOfGenericItems<Item>, Iterable<Item> {
    private Node<Item> first;           //link to the first one
    private Node<Item> last;            //link to the last one
    private int n;                      //number of elements in queue.

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }


    public LinkedListQueueImpl() {
        this.first = null;
        this.last = null;
        this.n = 0;
    }

    @Override
    public void enqueue(Item item) {
        //copy last
        Node<Item> oldLast = last;
        //create a new node
        last = new Node<>();
        last.item = item;
        last.next = null;
        //create a link to it
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        n++;
    }

    @Override
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        //get item
        Item item = first.item;
        //delete 1st element
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null; //to avoid loitering
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Item> {

        private Node<Item> current;

        public LinkedListIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
