import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        System.out.print("Enter the your mark:");
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		if ((mark <= 100)&&(mark>=90))
		{
			System.out.println("GRADE: A");
		}
		else if ((mark < 90)&&(mark>=75))
		{
			System.out.println("GRADE: B");
		}
		else if ((mark < 75)&&(mark>=55))
		{
			System.out.println("GRADE: C");
		}
        else if ((mark<55)&&(mark>=35))
        {
            System.out.println("GRADE: D");
        }
		else 
		{
			System.out.println("GRADE: Fail");
		}
    }
}
