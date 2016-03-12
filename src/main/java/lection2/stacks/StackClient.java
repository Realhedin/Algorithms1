package lection2.stacks;

import lection2.stacks.impl.SimpleArrayImpl;
import lection2.stacks.interfaces.StackOfGenericItems;

/**
 * Test client to check stack implementations.
 *
 * Created by dkorolev on 3/12/2016.
 */
public class StackClient {

    public static void main(String[] args) {
//        StackOfGenericItems<String> stack = new LinkedListStackImpl<>();

        String[] strA = new String[3];
        StackOfGenericItems<String> stack = new SimpleArrayImpl<>(strA);

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(stack.pop() +" : "+stack.size());
            } else {
                stack.push(arg);
            }
        }

    }
}
