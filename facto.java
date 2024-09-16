import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter a non-negative integer:");
		int a = scan.nextInt();
		int b = 1;
		for(int i = 1;i <= a;i++)
		{
			b = b * i;
		}
		System.out.println("Factorial of "+a+" is " + b);
    }
    
}
