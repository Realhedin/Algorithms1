package lection1.quickFind;

/**
 * new approach where elements in array
 * shows link to root
 * if id[i] = i, then it is root.
 *
 * Created by dkorolev on 2/7/2016.
 */
public class QuickUnionUF {

    private int[] id;    //array of elements.
    private int[] sz;    //array of number of objects in the tree rooted at i.

    public QuickUnionUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    /**
     * Method search for root of i index.
     * @param i - index.
     * @return index of root.
     */
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];  //impr2 to flat the tree(make every other node in path point to it's grandparent)
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
        if (i == j) {
            return;
        }
        //link root of smaller tree to root of larger tree
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    /**
     * Getter for id array.
     * @return array of elements.
     */
    public int[] getId() {
        return id;
    }
}
