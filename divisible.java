import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the limit");
        int limit= scan.nextInt();
        System.out.print("Enter the divisible number");
        int div=scan.nextInt();
        for(int i=1;i<limit;i++)
        {
            if(i%div==0)
            {
                System.out.println("the first number divisible by " +div + " is "+ i);
                break;
        }
            
}
    }
}
