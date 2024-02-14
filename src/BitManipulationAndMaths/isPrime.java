package BitManipulationAndMaths;

import java.util.Arrays;

public class isPrime {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n));
        boolean[] ans = SieveOfEratosthenes(n);
        System.out.println(Arrays.toString(ans));
    }

    public static boolean[] SieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2 ; i*i < n ; i++){
            for(int j = 2*i; j <= n; j = j+i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
