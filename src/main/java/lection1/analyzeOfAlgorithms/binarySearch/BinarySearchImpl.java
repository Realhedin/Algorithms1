package lection1.analyzeOfAlgorithms.binarySearch;

/**
 * Implementation of binary search
 * with log N complexity.
 * Created by dkorolev on 2/22/2016.
 */
public class BinarySearchImpl {

    /**
     * binary search method.
     * @param a - input array.
     * @param key - searching value.
     * @return index of searching value.
     */
    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
