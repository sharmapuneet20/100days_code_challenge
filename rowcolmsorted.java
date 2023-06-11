import java.util.Arrays;

public class rowcolmsorted {

    public static int[] search(int [][]matrix , int target){
        int row = 0;
        int colm = matrix.length -1;
        while(row< matrix.length && colm>=0){
            if (matrix[row][colm]== target){
                return new int[]{row, colm};
            }
            if (matrix[row][colm] < target){
                row++;
            }else {
                colm--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int [][]arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search( arr, 37)));
    }
}
