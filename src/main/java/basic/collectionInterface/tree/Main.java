package basic.collectionInterface.tree;

public class Main {
    public static void main(String[] args) {
        BTree tree = new BTree(new TreeNode(60));
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(80);

        System.out.println("중위 순회 결과:");
        tree.inOrderTraversal();

    }
}
