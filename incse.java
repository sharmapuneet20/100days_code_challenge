import java.util.*;
   public  class incse {
        static int isPrime(int n) {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return 0;

            return 1;
        }

        static void printPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (isPrime(i)
                    System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {4,5,12,16,20};



    }
}
