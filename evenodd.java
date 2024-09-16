import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if (n%2==0)
        {
            System.out.println("the given number"+n+"is even");
        }
        else
        {
            System.out.println("the given number " +n+ " is odd");
        }
    }
    
}
