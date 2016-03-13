package lection2.queue;

import lection2.queue.impl.ResizingArrayQueueImpl;

/**
 * Queue test client.
 *
 * Use following command line parameters: to not or be to - - - - - be -
 *
 * Created by dkorolev on 3/13/2016.
 */
public class QueueClient {

    public static void main(String[] args) {

//        QueueOfGenericItems<String> queue = new LinkedListQueueImpl<>();

//        QueueOfGenericItems<String> queue = new ResizingArrayQueueImpl<>();

//        LinkedListQueueImpl<String> queue = new LinkedListQueueImpl<>();

        ResizingArrayQueueImpl<String> queue = new ResizingArrayQueueImpl<>();

        for (String arg : args) {
            if (arg.equals("-")) {
                System.out.println(queue.dequeue() +" : "+queue.size());
            } else {
                queue.enqueue(arg);
            }
        }

        //after iterator implementation
        System.out.println();
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
