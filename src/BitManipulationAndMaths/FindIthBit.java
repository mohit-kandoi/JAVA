package BitManipulationAndMaths;

public class FindIthBit {
    public static void main(String[] args) {
    int num = 9;
    int i = 2;
        System.out.println(findBit(num,i));
    }
    public static int findBit(int num,int i){
        int mask = 1 << i;
        int ans = (num & mask);
        if (ans == 0) return 0;
        else return 1;

    }
}
