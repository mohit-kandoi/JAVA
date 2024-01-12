package LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(-1);
        Node<Integer> n1 = new Node<>(-1);
        Node<Integer> n2 = new Node<>(-1);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        Node<Integer> ans = removeDuplicates(head);
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
    public static Node<Integer> removeDuplicates(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            if(temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }

        }
        return head;

    }

}
