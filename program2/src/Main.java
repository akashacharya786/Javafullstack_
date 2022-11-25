import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Item Name:\n 1.inductioncooker\n 2.ElectricKettel\n");
        int choice = sc.nextInt() ;

        System.out.println("Enter the quantity: ");
        int qt = sc.nextInt();

        switch (choice)
        {
            case 1 :if(qt>=50){
                    System.out.println("price is 850\n");
                    }
                    else if(qt<=50 && qt>=30){
                System.out.println("price is 900\n");
                

            } else if (qt<=30) {
                System.out.println("price is 950\n");
            }
            break;
            case 2:if(qt>=50){
                System.out.println("price is 700\n");
            }
            else if(qt<=50 && qt>=30){
                System.out.println("price is 800\n");


            } else if (qt<=30) {
                System.out.println("price is 900\n");
            }
                break;
            default:System.out.println("Invalid..!!");
        }

    }
}