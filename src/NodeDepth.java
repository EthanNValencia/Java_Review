public class NodeDepth {

    public static int nodeDepths(BinaryTree root) {
        return countNodes(root, 0);
    }

    public static int countNodes(BinaryTree tree, int count){
        if(tree == null) return 0;
        return count + countNodes(tree.left, count + 1) + countNodes(tree.right, count + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}