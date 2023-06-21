
    import java.util.ArrayList;
import java.util.List;

    public class IncrementedSieve {
        public static List<Integer> incrementSieve(int n) {
            List<Integer> primes = new ArrayList<>();
            boolean[] isPrime = new boolean[n + 1];

            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            for (int p = 2; p <= n; p++) {
                if (isPrime[p]) {
                    primes.add(p);
                    for (int i = p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            return primes;
        }

        public static void main(String[] args) {
            int n = 30;
            List<Integer> result = incrementSieve(n);
            System.out.println(result);
        }
    }

