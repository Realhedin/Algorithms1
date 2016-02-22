package lection1.analyzeOfAlgorithms.observations;

import lection1.analyzeOfAlgorithms.binarySearch.BinarySearchImpl;

/**
 * 3sum question solution
 * with advanced algorithm.
 *
 * Created by dkorolev on 2/22/2016.
 */
public class NNlogN3SumAlgorithm {

    /**
     * number of three sum
     * that get 0.
     * N^2*logN complexity (2 loops + binary search)
     *
     * @param a - input int[]
     * @return number.
     */
    public static int countClever(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = BinarySearchImpl.binarySearch(a, -(a[i] + a[j]));
                if (k > j) {
                    count++;
                }
            }
        }
        return count;
    }
}
