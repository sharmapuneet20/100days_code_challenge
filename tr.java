public class tr {
        public static void main(String args[]){
//creating a matrix
            int original[][]={{1,2,3},{2,3,4},{5,6,7}};

            System.out.println("after tranpose:");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(original[j][i]+" ");
                }
                System.out.println();
            }
        }}

