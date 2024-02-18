package BinarySearch;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 0;
//        System.out.println(normalApproach(n));
        System.out.println(squareRootUsingBinarySearch(n));
    }
    public static int squareRootUsingBinarySearch(int n){
        int low = 0;
        int high = n;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid*mid > n){
                high = mid-1;
            }else if(mid*mid < n){
                ans = mid;
                low = mid + 1;
            }else if(mid*mid == n){
                return mid;
            }
        }
        return ans;
    }
    public static int normalApproach(int n){
        int ans = 0;
        for(int i = 0; i*i <= n; i++){
            ans = i;
        }
        return ans;
    }
}
