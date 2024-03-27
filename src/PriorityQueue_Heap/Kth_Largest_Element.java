package PriorityQueue_Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] array = {8,3,4,5,7,6,1,0};
        int k = 4;
        System.out.println(KthLargestElement(array,k));
    }
    public static int KthLargestElement(int[] array, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int e : array){
            pq.add(e);
            if(pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}
