public class pia {

    public static void pairsinarray(int numbers[]){
        int tp=0;
        for (int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for (int j=i+1; j< numbers.length; j++){
                System.out.print("("+ curr +" ,"+numbers[j]+")");
                tp++;
            }
        }
        System.out.println();
        System.out.println(tp);
    }
    public static void subarrays(int numbers[]){
        for (int i=0; i<numbers.length; i++){
            int start=i;
            for (int j=i; j<numbers.length; j++){
                int end= j ;
                for (int k= start; k<=end; k++){
                    System.out.println(numbers[k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int numbers[]= {2,4,6,8,10};
//        pairsinarray(numbers);
        subarrays(numbers);
    }
}
