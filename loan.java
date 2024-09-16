import java.util.Scanner;
public class loan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        int salary=scan.nextInt();

        if (age>25 || salary>20000)
        {
            System.out.println("You are Eligible for loan");
            
            System.out.println("Enter your salary :");
            int salay=scan.nextInt();
            if (salay<20000)
            {
                System.out.println("your salary is not suficient");
            }
            else if (salary>20000 && salary<50000)
            {
                System.out.println("your eligible for loan");
                System.out.println("your elibility of loan amount is:");
                System.out.println("1.30000 ,2.40000 ,3.50000");
                System.out.println("enter a number for the loan amount:");
                int n=scan.nextInt();
                if (n==1)
                {
                    System.out.println("your loan amout is:30000");
                    System.out.println("your loan amount is sended to your account");
                }
                else if(n==2)
                {
                    System.out.println("your loan amout is:40000");
                    System.out.println("your loan amount is sended to your account");
                }
                else if(n==3)
                {
                    System.out.println("your loan amout is:50000");
                    System.out.println("your loan amount is sended to your account");
                }
                else
                {
                    System.out.println("enter a correct number");
                    if (salary>50000)
                {
                    System.out.println("your are eligible for the loan for any amount you want");
                    int loan_amu=scan.nextInt();
                    System.out.println("your loan amount is ;"+loan_amu);
                    System.out.println("your loan amount is sended to your account");
                }
                else 
                {
                    System.out.println("Enter a salary amount above 20000");
                }
                }
                if (salary>50000)
                {
                    System.out.println("your are eligible for the loan for any amount you want");
                    int loan_amu=scan.nextInt();
                    System.out.println("your loan amount is ;"+loan_amu);
                    System.out.println("your loan amount is sended to your account");
                }
                else 
                {
                    System.out.println("Enter a salary amount above 20000");
                }
                
        
            }
        }
        else 
        {
            System.out.println("Your 'Salary' or 'age' is not suficient for the loan");
        }
    System.out.println("Thank you for vist our site");
}

}