import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 1;
        while(i <= 10) {
            System.out.print("Enter the Lucky Number: ");
            int LuckyNumber = sc.nextInt();

            System.out.println(LuckyNumber);
            if(LuckyNumber == 5){
                System.out.println("Great! You have guessed right Number...." +count);
            }
            else
            {
                System.out.print("Please try again...");
                count++;
            }

        }

    }
}