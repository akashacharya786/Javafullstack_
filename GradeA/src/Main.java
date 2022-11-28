import java.lang.reflect.Array;
import java.util.Scanner;

class Student {
String name;
String Grade;

    public Student(String name, String grade) {
        this.name = name;
        this.Grade = grade;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }

    public String getGrade() {
        return Grade;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Student[] Student = new Student[5];
        for(int i=0;i<2;i++) {
            System.out.println("Enter the Name: \n");
            String name = sc.next();

            System.out.println("Enter the Grade: \n");
            String grade = sc.next();
            Student[i] = new Student(name,grade);
        }
        String Grade ="A";
        for(int i=0;i<2;i++)
        {
            if(Student[i].getGrade().contains("A")){
                System.out.println(Student[i]);
            }

        }



    }
}