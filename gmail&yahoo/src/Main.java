import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String[] Email =new String[5];
        String[] Array_1 =  new String[5];
        String[] Array_2 =  new String[5];
        System.out.println("Enter the Email or Yahoo Adress: ");
        for(int i=0;i<5;i++)
        {
            String EMAIL = sc.next();
            Email[i] =EMAIL;

        }
        System.out.println("-----------------------------------------------------------------------------\n");
        for (int i=0;i<5;i++)
        {
            System.out.println(Email[i]);
        }
        System.out.println("------------------------------Gmail-----------------------------------------------\n");
        for(int i=0;i<5;i++)
        {
            if(Email[i].contains("@gmail.com"))
            {
                int  k=0;
                Array_1[k] = Email[i];
                System.out.println(Array_1[k]);
                k++;

            }
        }
        System.out.println("------------------------------yahooo-----------------------------------------------\n");
        for(int i=0;i<5;i++) {
            if (Email[i].contains("@yahoo.com")) {
                int L = 0;
                Array_2[L] = Email[i];
                System.out.println(Array_2[L]);
                L++;
            }
        }
        System.out.println("-------------------------------------------------------------------------------------\n");


    }
}