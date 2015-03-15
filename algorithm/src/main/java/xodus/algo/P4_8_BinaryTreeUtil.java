package xodus.algo;

/**
 * Created by mbc9news on 15. 3. 15..
 */
import xodus.algo.P4_8_BinaryTree.Node;

public class P4_8_BinaryTreeUtil {
    public static boolean isContain(P4_8_BinaryTree t1, P4_8_BinaryTree t2){
        return isSubTree(t1.getRoot(), t2.getRoot());
    }

    private static boolean isSubTree(Node n1, Node n2) {
        if (n1 == null) return false;
        if (n1.getData() == n2.getData()) {
            if (isSameTree(n1, n2)) return true;
        }

        return (isSubTree(n1.getLeft(), n2) || isSubTree(n1.getRight(), n2));
    }

    private static boolean isSameTree(Node n1, Node n2) {
        if (n2 == null) return true;
        if (n1.getData() != n2.getData()) return false;

        return (isSameTree(n1.getLeft(), n2.getLeft())
                && isSameTree(n1.getRight(), n2.getRight()));
    }
}
