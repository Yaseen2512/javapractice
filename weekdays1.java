import java.util.Scanner;
public class weekdays1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("enter a number: ");
        int week_day =scan.nextInt();
        switch (week_day) {
            
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
	    case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
