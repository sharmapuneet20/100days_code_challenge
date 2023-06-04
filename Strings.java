public class Strings {

    public static void printstring(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        char arr[]  = {'a','b','c','d'};
        String str= "abcd";
        String str2= new String("xyz");

//         strings are immutble
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);

//        String fullname = "tony stark";
//        System.out.println(fullname.length());
        String first = "rohit";
        String last= " sharma";
        String fulln = first +" "+ last ;
//        System.out.println(fulln.charAt(5));
printstring(fulln);


    }
}
