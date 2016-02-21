package lection1.quickFind;

/**
 * Common implementation of lection1.quickFind
 * Created by dkorolev on 2/7/2016.
 */
public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Method checks if p and q are connected.
     * @param p - index of 1st int.
     * @param q - index of second int.
     * @return - result of checking.
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /**
     * Method rearange all ints for p index to value of q index.
     * @param p - index of 1st int.
     * @param q - index of second int
     */
    public void union( int p, int q) {
        if (!connected(p, q)) {
            int valP = id[p];
            int valQ = id[q];
                for (int i = 0; i < id.length; i++) {
                if (id[i] == valP) {
                    id[i] = valQ;
                }
            }
        }
    }

    /**
     * Getter for id.
     * @return id array.
     */
    public int[] getId() {
        return id;
    }
}
