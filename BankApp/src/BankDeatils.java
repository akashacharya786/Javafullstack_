import java.util.Scanner;

public class BankDeatils {
    private String Acco_No;
    private String Name;
    private String Acc_type;
    private long Balance;
    Scanner sc = new Scanner(System.in);

    public void Open_New_Account(){
        System.out.println("Enter the Account No: ");
        Acco_No = sc.next();
        System.out.println("Enter the Account Name: ");
        Name = sc.next();
        System.out.println("Enter the Account Type: ");
        Acc_type = sc.next();
        System.out.println("Enter the Account Balance: ");
        Balance = sc.nextLong();
    }

    public void Display_Account(){
        System.out.println("Name of the Account Holder: "+Name);
        System.out.println("Account Number: "+Acco_No);
        System.out.println("Account Type: "+Acc_type);
        System.out.println("Account Balance: "+Balance);
    }
    public synchronized void Acc_Deposite(){
        Long amount;
        System.out.println("Enter the amount to be deposited: ");
        amount = sc.nextLong();
        try {
                System.out.println("Depositing...");
                Thread.sleep(2000);
                Balance = Balance + amount;
        }
        catch (InterruptedException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Amount Deposited Succesfully");
        System.out.println("Account Balance:"+Balance);
        notify();
    }
    public synchronized void withdraw(){
        long amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextLong();

        if(Balance < amount) {
        System.out.println("Low Balance..." + amount + "\tTrancstion Failed.....!");
        try{
            wait();
        }
        catch (InterruptedException e){
            System.err.println(e.getMessage());
        }
        }
        else {
            try {
                System.out.println("withdraw Processing...");
                Thread.sleep(2000);

                if (Balance >= amount) {
                    Balance = Balance - amount;
                    System.out.println("Remaining Balance: " + Balance);

                }
            }
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        }

    }







}
