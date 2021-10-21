import java.util.*;

public class BankAccount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n, t;
        long a;
        double b;


        System.out.println("Enter Name : ");
        n = sc.nextLine();

        System.out.println("Enter Type : ");
        t = sc.nextLine();

        System.out.println("Enter Account number : ");
        a = sc.nextLong();
        
        System.out.println("Enter Balance : ");
        b = sc.nextDouble();

        bank_account bank = new bank_account(n, a, t, b);
        bank.display();
        
        System.out.println("Enter amount to be deposited : ");
        double d = sc.nextDouble();
        bank.deposit(d);
        bank.display();


        System.out.print("\nEnter amount to be withdrawn : ");
        double w = sc.nextDouble();
        bank.withdraw(w);
        bank.display();
    }

}

class bank_account
{
    String name, type;
    long account_number;
    double balance_amount;

    bank_account(String n, long a, String t, double b)
    {
        name = n;
        account_number = a;
        type = t;
        balance_amount = b;
    }

   void deposit(double d)
    {
       balance_amount = balance_amount + d;
    }

   void withdraw(double w)
    {
        balance_amount = balance_amount - w;
    }

   void display()
    {
        System.out.println("\nName : " + name);
        System.out.println("Balance : " + balance_amount);
    }

}

