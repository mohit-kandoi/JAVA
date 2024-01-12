package Arrays;

public class DifferencePossible {
    public static void main(String[] args) {
        int[] arr = {13, 16, 18, 18, 19, 21, 22, 28, 30, 32, 34, 45, 46, 50, 51, 51, 54, 55, 63 ,64 ,65, 70, 75, 76, 78, 79 ,81 ,87, 92, 92, 93, 94 ,97};
        System.out.println(diffPossible(arr,17));
    }

    public static boolean diffPossible(int[] arr, int k)
    {

         for(int i=arr.length-1; i>=0; i--){

             for(int j=0; j<i; j++){

                 if(arr[i]- arr[j] == k) return true;

             }

         }
         return false;
    }

}
