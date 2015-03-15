package xodus.algo;

/**
 * Created by mbc9news on 15. 3. 15..
 */

import lombok.Data;

@Data
public class P4_8_BinaryTree {
    private Node root;

    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;

        } else {
            Node current = this.root;
            Node parent;
            while(true){
                parent = current;
                if (data < current.getData()){
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(node);
                        break;
                    }

                } else {
                    current = current.getRight();
                    if(current == null) {
                        parent.setRight(node);
                        break;
                    }
                }
            }
        }
    }

    @Data
    public class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
