package BitManipulationAndMaths;

public class GreatestCommonDivisor_GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);

    }
}
