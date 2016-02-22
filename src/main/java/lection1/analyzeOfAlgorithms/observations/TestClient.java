package lection1.analyzeOfAlgorithms.observations;

/**
 * Test client for 3Sum.
 *
 * Created by dkorolev on 2/21/2016.
 */
public class TestClient {

    public static final int N = 2000;

    public static void main(String[] args) {
        //test
//        int[] input = {
//                30, -40, -20, -10, 40, 0, 10, 5};
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = i;
        }

        //N^3 algorithm
        long startTime = System.nanoTime();
        int result = ThreeSumBrutoForce.count(input);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("Number:"+result+" : "+totalTime);

        //N^2*logN algorithm
        startTime = System.nanoTime();
        result = NNlogN3SumAlgorithm.countClever(input);
        totalTime = System.nanoTime() - startTime;
        System.out.println("Number:"+result+" : "+totalTime);

    }
}
