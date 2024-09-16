import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=scan.nextInt();
        if (num%2==0)
        {
            System.out.print("The given number " +num+ " is even");
        }
        else
        {
            System.out.print("The given number " +num+ " is odd");
        }

    }
}
