package lection1.analyzeOfAlgorithms.binarySearch;

/**
 * TestClient example for Binary search.
 *
 * Created by dkorolev on 2/22/2016.
 */
public class TestClient {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 18, 20, 22, 24, 27, 30};
        int position = BinarySearchImpl.binarySearch(array, 12);
        System.out.println("Position: "+position);
    }
}
