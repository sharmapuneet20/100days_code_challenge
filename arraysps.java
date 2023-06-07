public class arraysps {
    public  static  boolean numrepeat_check(int numbs[]){

        for (int i=0; i<numbs.length; i++){
            for (int j = i+1; j<numbs.length; j++){
                if (numbs[i]== numbs[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbs[] = {1,2,3,4};
        System.out.println(numrepeat_check(numbs));
    }
}

