
import java.util.Scanner;


public class stdd {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String dept= scan.nextLine();
       
        System.out.println("\n");
        System.out.println("The std detail");
        System.out.println("My Name is "+name);
        System.out.println("My score is "+score/10 +"/10");
        System.out.println("My dept is "+dept);

    }
}
