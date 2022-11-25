import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;
enum month {
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUNE,
    JULY,
    AUG,
    SEPT,
    OCT,
    NOV,
    DEC;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String monthstr = sc.nextLine();

        month N = month.valueOf(monthstr.toUpperCase());

            switch(N)
            {
                case JAN: System.out.println("Janavery");
                break;
                case FEB: System.out.println("Febuary");
                    break;
                case MAR: System.out.println("March");
                    break;
                case APR: System.out.println("April");
                    break;
                case MAY: System.out.println("May");
                    break;
                case JUNE: System.out.println("June");
                    break;
                case JULY: System.out.println("July");
                    break;
                case AUG: System.out.println("August");
                    break;
                case SEPT: System.out.println("September");
                    break;
                case OCT: System.out.println("Octuber");
                    break;
                case NOV: System.out.println("November");
                    break;
                case DEC: System.out.println("December");
                    break;
                default:System.out.println("Invalid");

            }
        }

    }
