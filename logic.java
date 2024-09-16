import java.util.Scanner;
public class logic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("the number is divisible by both the number 3 and 5");
        }
        else{
            System.out.println("the number is not divisible by both the number 3 and 5 ");
        }

        if (num%2==0 || num%8==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    
}
