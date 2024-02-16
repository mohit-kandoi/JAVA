package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5,6,7,8,8,8,8};
        int k = 5;
        System.out.println(firstOccurence(a,k));
    }

    public static int firstOccurence(int[] a,int k){
        int l = 0;
        int r = a.length-1;
        int ans = -1;
        while(l<=r){
            int m =l+(r-l)/2;
            if(k < a[m]){
                r = m-1;
            }
            else if(k > a[m]){
                l = m+1;
            }
            else{
                ans = m;
                r = m-1;
            }
        }
        return ans;
    }
    public static int binarySearch(int[] a,int k){
        int l = 0;
        int r = a.length-1;

        while(l <= r){
            int m = l+(r-l)/2;
            if(k < a[m]){
                r = m-1;
            }
            else if(k > a[m]){
                l = m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
