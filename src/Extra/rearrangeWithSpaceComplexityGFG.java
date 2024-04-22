package Extra;

import java.util.Arrays;

public class rearrangeWithSpaceComplexityGFG {

    public static void main(String[] args) {
        int arr[] = {-5, -3, -4, -5, -6,
                2 , 8, 9, 1 , 4};
        rearrange(arr,10);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightrotate(int arr[], int n, int outofplace,
                     int cur)
    {
        int tmp = arr[cur];
        for (int i = cur; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = tmp;
    }

    public static void rearrange(int arr[], int n)
            //positive Numbers at odd index
            // negative numbers at even index
    {
        int outofplace = -1;

        for (int i = 0; i < n; i++) {
            if (outofplace >= 0) {
                if (((arr[i] >= 0) && (arr[outofplace] < 0)) || ((arr[i] < 0) && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, i);
                    if (i - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }
            if (outofplace == -1) {
                if (((arr[i] >= 0) && ((i & 0x01) == 0)) || ((arr[i] < 0) && (i & 0x01) == 1))
                    outofplace = i;
            }
        }
    }
}
