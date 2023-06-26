class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
         int col0 = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    //  mark the ith row
                    matrix[i][0] = 0;
                }
                // mark the jth col
                if(j!=0){
                    matrix[0][j]=0 ;
                }
                else{
                    col0 = 0;
                }
            }
        }

        //  move in the matrix
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] !=0 ){
                 
                //  check for col & col

                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                    matrix[i][j] = 0;
                }
                }
            }
        }

        //  marking of a row
        if(matrix[0][0] ==0){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }
        //  marking of a col
        if(col0 == 0 ){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
    }
