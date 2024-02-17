package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {5,2,3,8,9,12,15,15,15};
        int k = 13;
        System.out.println(upperBound(a,k));
    }

    public static int upperBound(int[] a, int k){
        int l = 0;
        int ans = -1;
        int r = a.length-1;
        while(l <= r){
            int m = l+(r-l)/2;
            if(k < a[m]){
                r = m-1;
            }
            else if(k > a[m]){
                l = m+1;
            }
            else if(k == a[m]){
                l = m+1;
//                ans = l;
            }
        }
        ans = l;
        return ans;
    }

    public static int countOccurrence(int[] a,int k){
        int firstOccurrence = firstOccurrence(a,k);
        int lastOccurrence = lastOccurrence(a,k);
        if(firstOccurrence == -1 && lastOccurrence == -1) return 0;
        return lastOccurrence-firstOccurrence+1;
    }
    public static int lastOccurrence(int[] a,int k){
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
                l = m+1;
            }
        }
        return ans;
    }
    public static int firstOccurrence(int[] a,int k){
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
