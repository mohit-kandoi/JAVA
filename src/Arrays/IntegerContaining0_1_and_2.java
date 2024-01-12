package Arrays;

import java.util.*;
public class IntegerContaining0_1_and_2 {
    public static void main(String[] args) {

        List<Integer> ans = new ArrayList<>();
        int[] arr = {123,312,15264,132,0,45};
        ans = find123Digits(arr);
        System.out.println(ans);


    }

    public static List<Integer> find123Digits(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            boolean ans = check(arr[i]);
            if(ans){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }else{
            Collections.sort(list);
            return list;
        }
    }
    static boolean check(int a){
        boolean one = false;
        boolean two = false;
        boolean three = false;
        if(a < 123) return false;
        while(a > 0){
            int rem = a%10;
            if(rem == 1) one = true;
            if(rem == 2) two = true;
            if(rem == 3) three = true;
            a = a/10;
        }
        if(one && two && three) return true;
        else return false;
    }

}
