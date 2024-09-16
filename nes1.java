import java.util.Scanner;
public class nes1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=scan.nextInt();

        if (num>0)
        {
            System.out.println("the given nhumber is positive");
            if (num%2==0)
            {
                System.out.println("the given number is even");
            }
            else 
            {
                System.out.println("the given number is odd");
            }
        }
        else if (num<0)
        {
            System.out.println("the given number is negative");
            if (num%2==0)
            {
                System.out.println("the given number is even");
            }
            else
            {
                System.out.println("the given number is odd");
            }
        }
        else
        {
            System.out.println("zero is not a even neither odd give the anoter number");
        }
            
    }
        
}
    
