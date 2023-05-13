public class Countdigit_bm {
//    find count of digit which divides a number
    static int evenlyDivides(int N){
        int count =0;
        int num =N;
        while (num > 0)
        {
            if((num%10)!=0  && N%(num % 10)==0)
                count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivides(12));
        System.out.println(evenlyDivides(100));
    }
}
