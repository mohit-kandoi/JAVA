package LinkedList;

public class ReOrderLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;n4.next = n5;
        print(reorder(head));
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node<Integer> reorder(Node<Integer> head){

        Node<Integer> l1 = head;
        Node<Integer> l2 = reversedLinkedList(middle(head));
        while(true){
            if(l1 == l2 || l2==null) {
                l1.next = null;
                break;
            }
            Node<Integer> l1next = l1.next;
            Node<Integer> l2next = l2.next;
            l1.next = l2;
            l2.next = l1next;

            l1 = l1next;
            l2 = l2next;
        }
        return head;

    }
    static Node<Integer> middle(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node<Integer> reversedLinkedList(Node<Integer> head){
        Node<Integer> prev = head;
        Node<Integer> cur = head.next;
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
