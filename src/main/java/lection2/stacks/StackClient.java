package lection2.stacks;

import lection2.stacks.impl.SimpleArrayImpl;
import lection2.stacks.interfaces.StackOfGenericItems;

/**
 * Test client to check stack implementations.
 *
 * Use command line parameters: "to not or be to - - - - - be -".
 *
 * Created by dkorolev on 3/12/2016.
 */
public class StackClient {

    public static void main(String[] args) {
//        StackOfGenericItems<String> stack = new LinkedListStackImpl<>();

        StackOfGenericItems<String> stack = new SimpleArrayImpl<>(5);

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(stack.pop() +" : "+stack.size());
            } else {
                stack.push(arg);
            }
        }

    }
}
