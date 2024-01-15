package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        print(head);
        Node ans =  reverse(head);
        print(ans);

    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){

        if(head == null|| head.next == null) return head;

        Node prev = head;
        Node cur = head.next;
        head.next = null;
        while(cur != null){
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;

        }

        return prev;
    }

}
