import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print(" first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println(" first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print(" second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Calculate the sum of the first array
        int sum1 = 0;
        for (int i = 0; i < size1; i++) {
            sum1 += array1[i];
        }

        // Calculate the sum of the second array
        int sum2 = 0;
        for (int i = 0; i < size2; i++) {
            sum2 += array2[i];
        }

        // Compare the sums and print the result
        if (sum1 == sum2) {
            System.out.println("The arrays have the same sum.");
        } else {
            System.out.println("The arrays do not have the same sum.");
        }
    }
}
