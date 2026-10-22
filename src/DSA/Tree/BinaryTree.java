package DSA.Tree;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}

public class BinaryTree{
    Node root;

    public void add(int data){
        root=addRec(root,data);
    }

    public Node addRec(Node root, int data){
        if(root==null) root=new Node(data);
        else if(data<root.data) root.left=addRec(root.left,data);
        else if(data>root.data) root.right=addRec(root.right,data);
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
}
