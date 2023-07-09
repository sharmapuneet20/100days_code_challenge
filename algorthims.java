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
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int r = s.nextInt();
	    int c = s.nextInt();
	    int sum = 0, max =0;
		int a[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=s.nextInt();
		    }
		}
		if (r<3 || c<3)
		{
		    System.exit(0);
		}
		for(int i =0;i< r-2;i++)
		{
		    for(int j=0;j< c-2;j++)
		    {
		        sum = (a[i][j]+a[i][i+1]+a[i][i+2])+(a[i+1][j+1])+(a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
		        max = Math.max(max,sum);
		    }
		}
		System.out.println(max);
	}
}
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int r = s.nextInt();
	    int c = s.nextInt();
	    int sum = 0, max =0;
		int a[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=s.nextInt();
		    }
		}
		if (r<3 || c<3)
		{
		    System.exit(0);
		}
		for(int i =0;i< r-2;i++)
		{
		    for(int j=0;j< c-2;j++)
		    {
		        sum = (a[i][j]+a[i][i+1]+a[i][i+2])+(a[i+1][j+1])+(a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
		        max = Math.max(max,sum);
		    }
		}
		System.out.println(max);
	}
}
