package quickFind;

/**
 * new approach where elements in array
 * shows link to root
 * if id[i] = i, then it is root.
 *
 * Created by dkorolev on 2/7/2016.
 */
public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    /**
     * Method search for root of i index.
     * @param i - index.
     * @return index of root.
     */
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    /**
     * Method check if two elements are connected.
     * @param p - index of p element.
     * @param q - index of q element.
     * @return result of check.
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * Method union two elements (two root of trees).
     * @param p - index of p element.
     * @param q - index of q element.
     */
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    /**
     * Getter for id array.
     * @return array of elements.
     */
    public int[] getId() {
        return id;
    }
}
