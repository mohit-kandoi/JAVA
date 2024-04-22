package BinaryTree;

import java.util.ArrayList;

public class RightView {

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
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
        rightView(root,0,ans);
        System.out.println(ans);
    }
    static void rightView(Node root, int level, ArrayList<Integer> ans){
        if(root == null) return;
        if(level >= ans.size()){
            ans.add(root.data);
        }
        rightView(root.right,level+1,ans);
        rightView(root.left,level+1,ans);
    }
}

class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
    }
}
