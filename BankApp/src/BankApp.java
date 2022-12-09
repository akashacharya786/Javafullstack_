import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankDeatils BD = new BankDeatils();
        int choice;
    do {
        System.out.println("\n------BANK SYSTEM APPLICATION------\n");
        System.out.println("1.Open a New Account\n2.Deposite money to an account\n3.withdraw money from the account\n4.Close the Account\n");
        System.out.println("Enter the Choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                BD.Open_New_Account();
                break;
            case 2:
                BD.Acc_Deposite();
                break;
            case 3:
                BD.withdraw();
                break;
            case 4:
                return;
            default:
                System.out.println("invalid option...");
        }
    }while (choice!=4);
    }


}
