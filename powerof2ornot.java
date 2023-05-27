public class powerof2ornot {
    public static boolean ispowertwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispowertwo(15));

    }
}
