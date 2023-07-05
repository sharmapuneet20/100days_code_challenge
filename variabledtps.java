import java.util.*;
public class variabledtps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter first num: ");
//        int num_1 =sc.nextInt();
//        System.out.println("enter second num: ");
//        int num_2=sc.nextInt();
//        System.out.println("enter third num: ");
//        int num_3= sc.nextInt();
//        int avg= (num_1 + num_2 + num_3)/3;
//        System.out.println(avg);
//      float side = sc.nextFloat();
//      float area= side * side;
//        System.out.println(area);
        System.out.println("enter  cost of pencil:");
        float pencil= sc.nextFloat();
        System.out.println("enter cost of pen:");
        float pen=sc.nextFloat();
        System.out.println("enter cost of eraser: ");
        float eraser= sc.nextFloat();
        float total_cost= pencil + pen + eraser;
        System.out.println("total_cost is "+total_cost );
        float cost_with_gst = total_cost+ (0.18f *total_cost);
        System.out.println(cost_with_gst);
    }
}
