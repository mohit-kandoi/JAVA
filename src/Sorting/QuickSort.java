package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {2,5,6,4,3,7,8,1};
        quickSort(a,0,a.length-1);
        for (int e : a){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    static void quickSort(int[] a,int l, int h){
        if(l < h){
            int pivot = partition(a,l,h);
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,h);
        }
    }
    static int partition(int[] a,int l,int h){
        int pivot = a[l];
        int i = l;
        int j = h;

        while(i <= j){
            while(i<=h && a[i] <= pivot){
                i++;
            }
            while(j >= l && a[j] > pivot){
                j--;
            }
            if(i<j) swap(a,i,j);
        }
        swap(a,l,j);
        return j;
    }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
