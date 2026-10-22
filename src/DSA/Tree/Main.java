package DSA.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.add(20);
        tree.add(7);
        tree.add(7);
        tree.add(83);
        tree.add(2);
        tree.add(18);
        tree.add(23);

        tree.inorder();

    }
}
