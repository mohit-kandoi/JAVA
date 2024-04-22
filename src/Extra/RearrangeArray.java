package Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }

        int arr[] = {-9,1,-8,2,-9,5,8,5,6,6};
//         Output : [1, -9, 2, -8, 5, -9, 8, 5, 6, 6]

        // TEST CASE 1 : {}
        // OUTPUT : [];

        // TEST CASE 2 : {5,6,4,8,2,3}  all positive numbers.
        // OUTPUT : [5,6,4,8,2,3]

        /// TEST CASE 3 : {-5,-1,-3,-4};
        // OUTPUT : [-5,-1,-3,-4]

        // TEST CASE 4 : {5,6,3,2,1,4,-2,-3}  positive numbers are more than negative
        // OUTPUT : [5, -2, 6, -3, 3, 2, 1, 4]


        int ans[] = rearrangeArrayUnequalNumbers(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] rearrangeArrayUnequalNumbers(int[] nums) {

        // SPACE COMPLEXITY : O(n)
        // TIME COMPLEXITY : O(n)

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        //collecting positive numbers in positive List and
        // similarly, negative in negative list
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }
        //if any of the list is empty, means there is only one type of number in list
        // either positive or negative. if so, return the array as it is no need of rearrangement.
        if(positive.size() == 0 || negative.size() == 0){
            return nums;
        }

        // if both list have size > 0 means rearrangement can be done. so,

        int posIndex = 0;
        int negIndex = 0;

        int initialLoop = 0;

        if(positive.size() > negative.size()){
            initialLoop = negative.size() * 2;
        }else {
            initialLoop = positive.size() * 2;
        }

        // Loop will run until one of the list will not get empty.

        for(int i=0; i<initialLoop; i++){

            // at even index we need to put positive numbers
            if(i%2 == 0){
                nums[i] = positive.get(posIndex);
                posIndex += 1;
            }
            // at negative index we need to put negative numbers
            else{
                nums[i] = negative.get(negIndex);
                negIndex += 1;
            }
        }

        int afterInitialLoop = initialLoop;
        while(posIndex != positive.size()){
            nums[afterInitialLoop] = positive.get(posIndex);
            posIndex += 1;
            afterInitialLoop += 1;
        }
        while(negIndex != negative.size()){
            nums[afterInitialLoop] = negative.get(negIndex);
            negIndex += 1;
            afterInitialLoop += 1;
        }
        return nums;
    }
//    public static int[] rearrangeArray(int[] nums) {
//
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> negative = new ArrayList<>();
//
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] >= 0){
//                positive.add(nums[i]);
//            }else{
//                negative.add(nums[i]);
//            }
//        }
//        int posIndex = 0;
//        int negIndex = 0;
//        for(int i=0;i<nums.length;i++){
//            if(i%2 == 0){
//                nums[i] = positive.get(posIndex);
//                posIndex += 1;
//            }else{
//                nums[i] = negative.get(negIndex);
//                negIndex += 1;
//            }
//        }
//        return nums;
//    }
}
