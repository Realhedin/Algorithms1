package lection2.queue;

import lection2.queue.impl.LinkedListQueueImpl;
import lection2.queue.interfaces.QueueOfGenericItems;

/**
 * Queue test client.
 *
 * Use following command line parameters: to not or be to - - - - - be -
 *
 * Created by dkorolev on 3/13/2016.
 */
public class QueueClient {

    public static void main(String[] args) {

        QueueOfGenericItems<String> queue = new LinkedListQueueImpl<>();

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(queue.dequeue() +" : "+queue.size());
            } else {
                queue.enqueue(arg);
            }
        }
    }
}
