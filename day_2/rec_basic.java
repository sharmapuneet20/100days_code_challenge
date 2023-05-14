public class rec_basic {
  public static void printfromoneton(int n){
      if (n==5){
          System.out.println(5);
         return;
      }
      System.out.println(n);
      printfromoneton(n+1);

  }
    public static void main(String[] args) {
      printfromoneton(1);


    }
}
