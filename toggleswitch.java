import java.util.*;
public class toggleswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean []arr = new boolean[n+1];
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j=j+i){
                if (arr[j]==true){
                    arr[j] = false;

                }else{
                    arr[j] = true;
                }
            }
            for (i=1; i<=n; i++){
                if (arr[i]==true){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
