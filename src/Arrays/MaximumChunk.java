package Arrays;

public class MaximumChunk {

    public static void main(String[] args) {
        int[] a = {2,0,1,5,3,4,6};
        int ans = maxChunk(a);
        System.out.println(ans);
        //containing numbers from 0 to n-1;
    }

    public static int  maxChunk(int[] a){
        int ans = 0;
        int chunks = 0;
        int iterator = -1;
        for (int i = 0; i < a.length; i++) {

            if(i == a[i]){
                chunks++;
            }
            else{
                if(iterator < a[i]){
                    iterator = a[i];
                }
                else if(iterator == i){
                    chunks++;
                }
                else{
                    continue;
                }
            }

        }
        return chunks;
    }

}
