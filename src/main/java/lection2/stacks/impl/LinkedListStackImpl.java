package lection2.stacks.impl;

import lection2.stacks.interfaces.StackOfGenericItems;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Linked list implementation of a stack.
 *
 * Created by dkorolev on 3/12/2016.
 */
public class LinkedListStackImpl<Item> implements StackOfGenericItems<Item>, Iterable<Item> {

    private Node<Item> first;   //top stack
    private int n;              //size of a stack

    /**
     * Inner Node class.
     * @param <Item> - generic item.
     */
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }


    /** constuctor **/
    public LinkedListStackImpl() {
        first = null;
        n = 0;
    }


    @Override
    public void push(Item item) {
        //save old first
        Node<Item> oldFirst = first;
        //create new first object
        first = new Node<>();
        //fill it with information
        first.item = item;
        first.next = oldFirst;
        //increase size
        n++;
    }

    @Override
    public Item pop() {
        //check for empty
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        //save item from first
        Item item = first.item;
        //remove first
        first = first.next;
        //decrease size of a stack
        n--;
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


    /**
     * iterator implementation.
     * @return new ListIterator object.
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node<Item> current = first;

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
