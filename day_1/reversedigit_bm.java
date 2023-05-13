public class reversedigit_bm {
    public  static int reverse(int x) {
        int revnum = 0;
        while(x>0){
            int ld = x %10;
             revnum = (revnum *10) + ld;
            x/=10;
        }
        return revnum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12300));
    }
}
