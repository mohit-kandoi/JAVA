package Arrays;

public class MaxChunk2 {

    public static void main(String[] args) {
        int[] a = {3,2,1,0,4,6,8,66,55};
        System.out.println(chunks(a));
    }
    public static int chunks(int[] a){
        int chunks = 0;
        int start = a[0];
        for (int i = 1; i < a.length; i++) {
            if(start < a[i]) {
                start = a[i];
                chunks++;
            }
//            if(a[a.length-1] < start ) chunks++;
        }
        return chunks+1;
    }

}
