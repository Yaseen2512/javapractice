import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		if ((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.print("The given year "+year+ " is 'LEAP YEAR'");
		}
		else
		{
			System.out.print("The given year "+year+ " is 'NOT A LEAP YEAR'");
		}
    }
}
