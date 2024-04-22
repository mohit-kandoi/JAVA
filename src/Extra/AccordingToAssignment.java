package Extra;

import java.util.Arrays;

public class AccordingToAssignment {
    public static void main(String[] args) {
        int arr[] = {-3, -6, -8, -82,2,-3,-5,-6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[], int n,int cur,int outOfPlace){
        int temp = arr[cur];
        for(int i = cur; i > outOfPlace; i--){
            arr[i] = arr[i-1];
        }
        arr[outOfPlace] = temp;
    }
    public static void rearrange(int arr[]){
        // positive at even index
        // negative at odd index
        int n = arr.length;

        int outOfPlace = -1;

        for(int i=0; i<n; i++){

            if(outOfPlace == -1){
                if((arr[i] >= 0) && (i & 0x01) == 1 || (arr[i] < 0) && (i & 0x01) == 0 ){
                    outOfPlace = i;
                }
            }
            if(outOfPlace >= 0){
                if(arr[outOfPlace] >= 0 && arr[i] <0 || arr[outOfPlace] < 0 && arr[i] >= 0){
                    rotate(arr,n,i,outOfPlace);
                    if(i-outOfPlace >= 2){
                        outOfPlace = i;
                    }else{
                        outOfPlace = -1;
                    }
                }
            }
        }
    }

}

