public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("rohit");
        Student s3= new Student(34);

    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor called");
    }
    Student(String name) {
        this.name = name;

    }

    Student(int roll){
        this.roll = roll;

    }


}
