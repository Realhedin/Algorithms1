package lection1.analyzeOfAlgorithms.observations;

/**
 * Created by dkorolev on 2/21/2016.
 */
public class ThreeSumBrutoForce {

    /**
     * number of three sum
     * that get 0.
     * N^3 complexity (3 for loop)
     *
     * @param a - input int[]
     * @return number.
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
