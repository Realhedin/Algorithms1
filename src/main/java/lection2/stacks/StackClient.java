package lection2.stacks;

/**
 * Created by dkorolev on 3/12/2016.
 */
public class StackClient {

    public static void main(String[] args) {
        StackOfGenericItems<String> stack = new StackOfGenericItemsImpl<>();

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(stack.pop());
            } else {
                stack.push(arg);
            }
        }

    }
}
