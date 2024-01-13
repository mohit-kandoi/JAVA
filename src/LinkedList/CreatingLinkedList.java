package LinkedList;

public class CreatingLinkedList {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(8);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        printLinkedList(head);
    }
    public static void printLinkedList(Node<Integer> head){

        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();

    }


}
class Node<E>{
    E val;
    Node next;

    public Node(E val){
        this.val = val;
        this.next = null;
    }

    public Node(int i) {
        this.val = val;
        this.next = null;

    }
}
