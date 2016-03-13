package lection2.stacks;

import lection2.stacks.impl.ResizingArrayImpl;

import java.util.Iterator;

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

//        StackOfGenericItems<String> stack = new SimpleArrayImpl<>(5);

        ResizingArrayImpl<String> stack = new ResizingArrayImpl<>();

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(stack.pop() +" : "+stack.size());
            } else {
                stack.push(arg);
            }
        }


        //After implemention iterators
        //longhand version
        System.out.println();
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //shorthand version
        System.out.println();
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
