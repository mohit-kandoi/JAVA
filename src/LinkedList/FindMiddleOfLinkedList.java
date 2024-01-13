package LinkedList;

public class FindMiddleOfLinkedList {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        Node<Integer> middle = FindMiddle(head);
        System.out.print(middle.val);

    }
    public static Node<Integer> FindMiddle(Node<Integer> head){

        Node<Integer> temp = head;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}

//class Node{
//    int val;
//    Node next;
//    public Node(int val){
//        this.val = val;
//        this.next = null;
//    }
//
//}
