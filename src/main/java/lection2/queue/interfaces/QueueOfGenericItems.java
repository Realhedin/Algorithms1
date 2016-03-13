package lection2.queue.interfaces;

/**
 * Interface for queue stacks.
 *
 * Created by dkorolev on 3/13/2016.
 */
public interface QueueOfGenericItems<Item> {

    /**
     * Insert a new string into queue.
     * @param item - element to insert.
     */
    void enqueue(Item item);

    /**
     * Remove and return element
     * that was least recently added.
     * @return item
     */
    Item dequeue();

    /**
     * check for empty queue.
     * @return true if empty.
     */
    boolean isEmpty();

    /**
     * number of items in queue.
     * @return number.
     */
    int size();
}
