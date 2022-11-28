import java.lang.reflect.Array;
import java.util.Scanner;

class Student {

    String Emp_Id;
    String Emp_Name;
    int Emp_age;


    public Student(String Emp_Id, String Emp_Name,int Emp_age) {
        this.Emp_Id = Emp_Id;
        this.Emp_Name = Emp_Name;
        this.Emp_age = Emp_age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Emp_Id='" + Emp_Id + '\'' +
                ", Emp_Name='" + Emp_Name + '\'' +
                ", Emp_age=" + Emp_age +
                '}';
    }

    public int getEmp_age() {
        return Emp_age;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Student[] Student = new Student[5];
        for(int i=0;i<2;i++) {
            System.out.println("Enter the Id: \n");
            String Id = sc.next();

            System.out.println("Enter the Name: \n");
            String name = sc.next();

            System.out.println("Enter the age: \n");
            int age = sc.nextInt();

            Student[i] = new Student(Id,name,age);
        }
        for(int i=0;i<2;i++)
        {
            int Avg_age = (Student[i].getEmp_age())/5;
            System.out.println("Average is-->"+Avg_age);
            break;
        }





    }
}