import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ACC no:");
        long Accno=scan.nextLong();
        System.out.println("Account Holder Name : '*********'");
        System.out.println("Enter a balance");
        int Current_balance=scan.nextInt();

        System.out.println("Thanks for connect with our bank what type of service you want");
        System.out.println("1. check balance, 2. withdrawal, 3. deposite");
        System.out.println("enter the number display above to mention your service you want");
        int n=scan.nextInt();
        if (n==1)
        {
            System.out.println("Your Account number : "+Accno);
            System.out.println("Account Holder Name : '*********'");
            System.out.println("Your Account balance : "+Current_balance);
        }
        else if (n==2)
        {
            System.out.println("The ATM contain only 100 , 200 , 500 notes so type the in te multiple of 100, 200, 500");
            System.out.print("Enter a withdrawal amount:");
            int withd=scan.nextInt();
            if (withd>Current_balance)
            {
                System.out.print("Insufficient Balance");
            }
            System.out.println("Withdrawal Successful");
            System.out.println("\n");
            System.out.println("Your Account number : "+Accno);
            System.out.println("Account Holder Name : '*********'");
            int min=Current_balance-withd;
            System.out.println("New Balance  : "+min);
        }
        else if (n==3)
        {
            System.out.print("Enter a Deposite amount: ");
            int depo=scan.nextInt();
            if (depo%10==0)
            {
                System.out.println("Deposite Successful");
                System.out.println("\n");
                System.out.println("Your Account number : "+Accno);
                System.out.println("Account Holder Name : '*********'");
                int max=Current_balance+depo;
                System.out.println("New Balance  : "+max);
            }
            else
            {
                System.out.println("You Cannot deposite the change like 1rs or 2rs like that");
                System.out.println("reenter a deposite amount :");
                int depo1=scan.nextInt();
                if(depo1%10==0)
                {
                    System.out.println("Deposite Successful");
                    System.out.println("\n");
                    System.out.println("Your Account number : "+Accno);
                    System.out.println("Account Holder Name : '*********'");
                    int max1=Current_balance+depo1;
                    System.out.println("New Balance  : "+max1);
                }
                else
                {
                    System.out.println("Sorry you may not be doposite at this moment you may tay again later");
                }

            }
        }
        System.out.println("Thanks for vist our ATM");


    }
}

