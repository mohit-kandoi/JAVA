package LinkedList;

public class PartitionList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(6);
        Node<Integer> n1 = new Node<>(5);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(2);
        Node<Integer> n5 = new Node<>(1);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;n4.next = n5;
        int value = 4;

        print(join(smaller(head,value),bigger(head,value)));
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> smaller(Node<Integer> head,int value){
        Node<Integer> smallerHead = new Node<>(Integer.MAX_VALUE);
        Node<Integer> smallerCur = smallerHead;
        Node<Integer> temp = head;
        while(temp != null){
            if(temp.val < value){
                smallerCur.next = new Node<>(temp.val);
                smallerCur = smallerCur.next;
            }
            temp = temp.next;
        }
        smallerHead = smallerHead.next;
        return smallerHead;
    }
    public static Node<Integer> bigger(Node<Integer> head,int value){
        Node<Integer> biggerHead = new Node<>(Integer.MIN_VALUE);
        Node<Integer> biggerCur = biggerHead;
        Node<Integer> temp = head;
        while(temp != null){
            if(temp.val >= value){
                biggerCur.next = new Node<>(temp.val);
                biggerCur = biggerCur.next;
            }
            temp = temp.next;
        }
        biggerHead = biggerHead.next;
        return biggerHead;
    }
    public static Node<Integer> join(Node<Integer> smallerHead, Node<Integer> biggerHead){
        Node<Integer> temp = smallerHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = biggerHead;
        return smallerHead;
    }
}
