package BinarySearch;

public class CutTheTrees {
    public static void main(String[] args) {
        int[] a = {1,7,6,3,4,7};
        int k = 1;
        System.out.println(cutTrees(a,k));

    }
    public static int cutTrees(int[] a,int k){
        int low = 0;
//        int totalWoods = 0;
        int high = (int) 1e9;
        while (low <= high) {
            int mid = low + (high-low)/2;
            int totalWoods = getTreesAfterCutting(a,mid);
            if(totalWoods == k) return mid;
            else if(totalWoods > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int getTreesAfterCutting(int[] a,int cut){
        int totalWoods = 0;
        for(int e : a){
            if(e > cut){
                totalWoods = totalWoods + (e-cut);
            }else{
                totalWoods = totalWoods + 0;
            }
        }
        return totalWoods;
    }
}
