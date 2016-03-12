package lection1.quickFind;

/**
 * Test class to test algorithms.
 *
 * Created by dkorolev on 2/7/2016.
 */
public class TestClient {

    public static void main(String[] args) {
        //common QuickFind algorithm
        QuickFindUF qf = new QuickFindUF(10);
        qf.union(9,7);
        qf.union(0,9);
        qf.union(6,4);
        qf.union(4,9);
        qf.union(2,8);
        qf.union(3,0);
        for (int i : qf.getId()) {
            System.out.print(i);
        }

        System.out.println("\n");

        //another variant of implementation
        QuickUnionUF unionUF = new QuickUnionUF(10);
        unionUF.union(6,9);
        unionUF.union(2,7);
        unionUF.union(4,0);
        unionUF.union(8,7);
        unionUF.union(1,2);
        unionUF.union(6,4);
        unionUF.union(2,3);
        unionUF.union(0,3);
        unionUF.union(3,5);
//        System.out.println(unionUF.connected(0,2));
//        unionUF.union(0,1);
//        System.out.println(unionUF.connected(0,2));
//        unionUF.union(0,2);
//        System.out.println(unionUF.connected(0,2));
        for (int i : unionUF.getId()) {
            System.out.print(i);
        }

    }
}
