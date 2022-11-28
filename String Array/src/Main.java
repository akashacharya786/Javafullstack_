import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Array = new int[5];
        String[] names =  new String[5];
        String[] Only_A_Names = new String[5];
        System.out.println("Enter the 5 names: ");


        for(int i=0;i<5;i++)
        {
            String name =  sc.next();
            names[i] = name;
        }
        for(int i=0;i<5;i++) {
            if (names[i].startsWith("A")) {
                int k = 0;
                Only_A_Names[k] = names[i];
                k++;
            }

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(names[i]);
        }

    }
}