import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class euler_phi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        boolean isStrobogrammatic = isStrobogrammatic(number);
        System.out.println(number + " is" + (isStrobogrammatic ? "" : " not") + " a strobogrammatic number.");

        sc.close();
    }

    private static final Map<Character, Character> STROBO_MAP;

    static {
        // Initialize the map of strobogrammatic digits
        STROBO_MAP = new HashMap<>();
        STROBO_MAP.put('0', '0');
        STROBO_MAP.put('1', '1');
        STROBO_MAP.put('6', '9');
        STROBO_MAP.put('8', '8');
        STROBO_MAP.put('9', '6');
    }

    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);

            if (!STROBO_MAP.containsKey(c1) || STROBO_MAP.get(c1) != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
