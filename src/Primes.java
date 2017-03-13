/**
 * Created by jnew23 on 3/13/17.
 */

public class Primes {

    public static final int N = 1000;

    public static void main(String[] args) {
        int[] primes = new int[N];
        int primeSlot = 1;
        primes[0] = 2;

        for (int contestant = 3; primeSlot < N; contestant += 2) {
            boolean prime = true;
            for (int i = 0; i < primeSlot; i++) {
                int witness = primes[i];
                if (contestant % witness == 0) {
                    prime = false;
                }
                if (witness * witness > contestant) {
                    break;
                }
            }
            if (prime) {
                primes[primeSlot] = contestant;
                primeSlot++;
            }
        }
        for (int i : primes) {
            System.out.println(i);
        }
    }

}
