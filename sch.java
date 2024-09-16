import java.util.Scanner;
public class sch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int income=scan.nextInt();
        if (income<70000)
        {
            System.out.println("Scholarship is available");
        }
        else 
        {
            System.out.println("Scholarship is not available");
        }
    }
    
}
