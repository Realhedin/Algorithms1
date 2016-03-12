package lection2.stacks;

/**
 * Test client to check stack implementations.
 *
 * Created by dkorolev on 3/12/2016.
 */
public class StackClient {

    public static void main(String[] args) {
        StackOfGenericItems<String> stack = new LinkedListStackOfGenericItemsImpl<>();

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(stack.pop() +" : "+stack.size());
            } else {
                stack.push(arg);
            }
        }

    }
}
