import java.util.Scanner;

public class hashingbasic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        value of array input
          int n = sc.nextInt();
         int[]arr = new int[n];
//         array inputing
         for (int i=0; i<n ; i++){
             arr[i] = sc.nextInt();
         }
//      pre-compute
        int []hash = new int[13];
         for (int i=0; i<n; i++){
              hash[arr[i]] += 1 ;
         }
//         query input
        int q = sc.nextInt();
         for (int i=0; i<q; i++){
              int  numbers = sc.nextInt();
             System.out.print(hash[numbers] +" ");
         }
    }
}
