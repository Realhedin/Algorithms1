package lection2.stacks;

import java.util.NoSuchElementException;

/**
 * Created by dkorolev on 3/12/2016.
 */
public class StackOfGenericItemsImpl<Item> implements StackOfGenericItems<Item> {

    private Node<Item> first;  //top stack


    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }



    public StackOfGenericItemsImpl() {
        first = null;
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
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return 0;
    }
}
