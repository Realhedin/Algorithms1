package lection1.analyzeOfAlgorithms.observations;

/**
 * Created by dkorolev on 2/21/2016.
 */
public class TestClient {

    public static void main(String[] args) {
        int[] input = {
                30, -40, -20, -10, 40, 0, 10, 5};
        long startTime = System.nanoTime();
        int result = ThreeSumBrutoForce.count(input);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("Number:"+result+" : "+totalTime);

    }
}
