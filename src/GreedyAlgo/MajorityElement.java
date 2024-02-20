package GreedyAlgo;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {1,2,4,3,4,4};
        System.out.println(majorityElements(a));
    }
    static int majorityElements(int[] a){
        int count = 1;
        int majority = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] == majority){
                count ++;
            }else{
                count--;
            }
            if(count == 0){
                majority = a[i];
                count = 1;
            }
        }
        int freq = 0;
        for(int e : a){
            if(e == majority) freq++;
        }

        return freq > a.length/2 ? majority : -1;
    }

}
