package basic.collectionInterface.tree;

public class BTree {
    private TreeNode root;

    public BTree(TreeNode root) {
        this.root = root;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else if (data > root.getValue()) {
            root.setRight(insertRec(root.getRight(), data));
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrderRec(root.getRight());
        }
    }



}
