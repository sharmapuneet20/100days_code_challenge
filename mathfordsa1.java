public class mathfordsa1 {

//     check odd even using bit
    public static boolean isodd(int num){
         return ((num & 1) == 1);
    }
//    find digit in array only  appear once
     public static int  unique(int[]arr){
        int unique = 0;
         for (int n: arr) {
             unique ^= n;
         }
         return unique;
     }
    public static void main(String[] args) {
//        int n =65;
//        System.out.println(isodd(n));
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(unique(arr));
    }
}

// power of two or not

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if ((n & (n-1)) == 0){
            return true;
        }
        return false;
        
        }
        
    }
