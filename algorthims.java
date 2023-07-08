//swapping two nibbles 
//chinese remainder theorem 
//euclid 
//euler phi function 

import java.util.*;
public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        
        if (isBinaryPalindrome(num)) {
            System.out.println(num + " is a binary palindrome.");
        } else {
            System.out.println(num + " is not a binary palindrome.");
        }
    }
    
    public static boolean isBinaryPalindrome(int num) {
        String binary = Integer.toBinaryString(num);
        int i = 0, j = binary.length() - 1;
        
        while (i < j) {
            if (binary.charAt(i) != binary.charAt(j)) {
                return false; 
            }
            i++; 
            j--; 
        }
        
        return true;
    }
}
