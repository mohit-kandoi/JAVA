package LinkedList;

public class PalindromeLinkedList {
    /*
     Approach:-
        will first find the middle of linked list using middle function.
        then reverse the remaining half list and
        then we will get head of two list
        1st the starting half
        2nd which we reversed
        then just match both the list.
    */
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
//        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(3);
        Node<Integer> n5 = new Node<>(2);
        Node<Integer> n6 = new Node<>(1);

        head.next = n1; n1.next = n2; n2.next = n4;
//        n3.next = n4;
        n4.next = n5;n5.next = n6;

        Node<Integer> middle = middle(head);
        Node<Integer> t1 = head;
        Node<Integer> t2 = reversedLinkedList(middle);
        System.out.println(palindrome(t1,t2));


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
    static boolean palindrome(Node<Integer> head1,Node<Integer> head2){

        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

}
