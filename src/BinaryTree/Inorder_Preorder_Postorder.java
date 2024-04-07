import java.util.ArrayList;

public class Inorder_Preorder_Postorder {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(1);
        Node n3 = new Node(4);
        Node n4 = new Node(2);
        Node n5 = new Node(8);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println(minimumInTree(root));
//        System.out.println(heightOfBinaryTree(root));
        ArrayList<Integer> ans = new ArrayList<>();
        nodesAtLevelK(root,2,ans);
        System.out.println(ans);

    }

    static void nodesAtLevelK(Node root, int level, ArrayList<Integer> ans){
        if(root == null && level < 0) return;
        if(level == 0){
            ans.add(root.data);
            return;
        }
        nodesAtLevelK(root.left,level-1,ans);
        nodesAtLevelK(root.right,level-1,ans);
    }
    static int heightOfBinaryTree(Node root){
        if(root == null) return 0;
        int LeftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return Math.max(LeftHeight,rightHeight)+1;
    }
    static int minimumInTree(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int left = minimumInTree(root.left);
        int right = minimumInTree(root.right);
        return Math.min(Math.min(left,right),root.data);
    }
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
