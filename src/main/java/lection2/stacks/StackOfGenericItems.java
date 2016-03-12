package lection2.stacks;

/**
 * Created by dkorolev on 3/12/2016.
 */
public interface StackOfGenericItems<Item> {

    void push(Item item);

    Item pop();

    boolean isEmpty();

    int size();
}
