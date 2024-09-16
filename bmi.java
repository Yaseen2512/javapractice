import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter your weight:");
		float w = scan.nextFloat();
		System.out.print("Enter your height:");
		float h = scan.nextFloat();
		float c = w/(h*h);
		if (c<=18.5)
		{
			System.out.printf("BMI: "+"%.2f",c);
			System.out.print(", Category: Underweight ");
		}
		else if ((18.5<=c)&&(c<24.9))
		{
			System.out.printf("BMI: "+"%.2f",c);
			System.out.print(", Category: Normal weight ");
		}
		else if  ((25.0 <=c)&&(c<29.9))
		{
			System.out.printf("BMI: "+"%.2f",c);
			System.out.print(", Category: Overweight ");
		}
		else 
		{
			System.out.printf("BMI: "+"%.2f",c);
			System.out.print(", Category: Obesity");

		}
    }
}
