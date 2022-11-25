import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the opetion:1.domestic\n2.Industrial\n");
        int choice = sc.nextInt();

        System.out.println("Enter the unit: ");
        int unit = sc.nextInt();

        double res;

        switch (choice)
        {
            case 1: if(unit >= 200)
            {
                System.out.println("Your Eligible for 50% discount");
                res = (unit*5);
                double res2 = (unit*5)*0.5;
                double bill = res - res2;
                System.out.println(bill);
            }
            else if(unit < 200){
                System.out.println("Your not Eligible for 50% discount");
                res = (unit*5);
                System.out.println(res);
            }
            break;
            case 2:if(unit < 1000){
                System.out.println("Your  Eligible for 10% subsidy");
                res =(unit*8);
                double res2 = (unit*8)*0.1;
               double bill =res - res2;

                System.out.println(bill);
            }
            break;
            default:System.out.println("Invalid....");


        }
    }
}