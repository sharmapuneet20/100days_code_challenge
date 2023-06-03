public class twodarrayspiralques {
    public static void spiral(int matrix[][]){
      int Start_row = 0;
      int Start_col = 0;
      int end_row = matrix.length-1;
      int end_col = matrix[0].length -1;

      while(Start_row <= end_row && Start_col <= end_col){
//          top
          for(int j=Start_col; j<=end_col; j++){
              System.out.print(matrix[Start_row][j]+" ");
          }

//          right
          for (int i=Start_row+1; i<=end_row; i++){
              System.out.print(matrix[i][end_col]+" ");
          }
//          bottom
          for (int j=end_col-1; j>=Start_col; j--){
              if (Start_row == end_row){
                  break;
              }
              System.out.print(matrix[end_row][j]+" ");
          }
//          left
          for (int i=end_row -1; i>=Start_row+1; i--){
              if (Start_col==end_col){
                  break;
              }
              System.out.print(matrix[i][Start_col]+" ");
          }
          Start_col++;
          Start_row++;
          end_col--;
          end_row--;
      }


    }

    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for (int i=0; i< matrix.length; i++){
//            pd
            sum+= matrix[i][i];
//            sd
            if (i!= matrix.length-1-i)
                     sum += matrix[i][matrix.length - i - 1];

        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        spiral(matrix);
        System.out.println(diagonalsum(matrix));
    }
}

