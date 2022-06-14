import java.util.ArrayDeque;

public class InvertBinaryTree {

    public static void main(String[] args){

    }

    public static void invertBinaryTree(BinaryTree tree) {
        ArrayDeque<BinaryTree> queue = new ArrayDeque<BinaryTree>();
        queue.addLast(tree);
        while(!queue.isEmpty()) {
            BinaryTree current = queue.pollFirst();
            swap(current);
            if(current.left != null) {
                queue.addLast(current.left);
            }
            if(current.right != null) {
                queue.addLast(current.right);
            }
        }
    }

    public static void swap(BinaryTree tree) {
        BinaryTree moveToLeft = tree.right;
        tree.left = tree.right;
        tree.right = moveToLeft;
    }
}

class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }
}