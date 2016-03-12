package lection2.stacks;

/**
 * General interface for a linked list.
 * It uses generic Item to suit any object type in a client.
 *
 * Created by dkorolev on 3/12/2016.
 */
public interface StackOfGenericItems<Item> {

    /**
     * Push new item into the stack.
     * @param item generic object.
     */
    void push(Item item);

    /**
     * remove item from a stack.
     * @return item object.
     */
    Item pop();

    /**
     * check stack for empty.
     * @return result of check.
     */
    boolean isEmpty();

    /**
     * size of the stack
     * @return size.
     */
    int size();
}
