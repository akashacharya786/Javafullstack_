import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Course ID/Course Name/Course Fee\n");
        Course[] Course = new Course[5];
        boolean isCourseAvailable = false;
        for(int i=0;i<2;i++) {
            System.out.println("Enter the Course Id: \n");
            String Id = sc.next();

            System.out.println("Enter the Course Name: \n");
            String Name = sc.next();

            System.out.println("Enter the Course Fee: \n");
            String Fee = sc.next();


            Course[i] = new Course(Id, Name, Fee);

        }
        System.out.println("---------Enter the Course ID:---------------- \n");
        String ID = sc.next();
        int i;
        for(i=0;i<2;i++)
        {
            if(ID.equals(Course[i].getCourse_Id())) {
                System.out.println("Available");
                isCourseAvailable = true;

            } else if (is) {
                System.out.println("Not Available");

            }


        }







    }


}