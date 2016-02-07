package quickFind;

/**
 * Test class to test algorithms.
 *
 * Created by dkorolev on 2/7/2016.
 */
public class TestClient {

    public static void main(String[] args) {
        //common QuickFind algorithm
        QuickFindUF qf = new QuickFindUF(9);
        System.out.println(qf.connected(0,2));
        qf.union(0,1);
        System.out.println(qf.connected(0,2));
        qf.union(0,2);
        System.out.println(qf.connected(0,2));
        for (int i : qf.getId()) {
            System.out.print(i);
        }

        System.out.println();

        //another variant of implementation
        QuickUnionUF unionUF = new QuickUnionUF(9);
        System.out.println(unionUF.connected(0,2));
        unionUF.union(0,1);
        System.out.println(unionUF.connected(0,2));
        unionUF.union(0,2);
        System.out.println(unionUF.connected(0,2));
        for (int i : unionUF.getId()) {
            System.out.print(i);
        }

    }
}
