public class Armstrong_numbers_bm {
    public static  boolean isArmstrong(int x) {
        int duplicate = x;
        int sum = 0;
        while (x > 0) {
            int ld = x % 10;
            sum = sum + (ld * ld * ld);
            x /= 10;
        }
        if (sum == duplicate) {
            return true;
        } else {
            return false;
        }


        }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));

    }

    }
