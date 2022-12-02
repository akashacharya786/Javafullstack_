import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Phonebook> phonebookList = new ArrayList<>();
        Phonebook pb = new Phonebook();
        System.out.println("Enter E to Escape/quite: ");
        while (true){
            System.out.println("1.Add contact\n 2.Update Contact\n 3.delete contact\n 4.view all\n  6.Escape\n");
            int c = sc.nextInt();
            if(c == 1){
                System.out.println("Enter the Conatct Name: ");
                String Contact_Name = sc.next();
                System.out.println("Enter the Contact Number: ");
                double Contact_Number = sc.nextDouble();
                Phonebook phonebook = new Phonebook(Contact_Name,Contact_Number);
                pb.addPhonebook(phonebook);
                System.out.println("Contact added Successfully");
                phonebookList.add(phonebook);
                
            } else if (c == 2) {
                System.out.println("Enter the Number of the contact that you to want replace: ");
                String contact = sc.next();
                System.out.println("Enter the updated name: ");
                String newName = sc.nextLine();

            } else if (c == 3) {
                System.out.println("Enter the number to delete: ");
                int contact = sc.nextInt();
                phonebookList.remove(contact);
                System.out.println("contact deleted successfully \n");
                for (Phonebook p:phonebookList){
                    System.out.println(p.getContact_Name()+" "+ p.getContact_number());


                }
            } else if (c == 4) {

                for (Phonebook p:phonebookList){
                    System.out.println(p.getContact_Name()+" "+ p.getContact_number());


                }

                
            } else if (c == 6) {
                break;
            }
            else {
                c = 1;
            }

        }
    }
}