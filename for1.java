import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        for (int i=a;i<b;i++)
        {
            
            if (i%2==0)
            {
                System.out.println("even number :"+i);
            }
            else 
            {
                System.out.println("odd number :"+i);
            }
        }
        
    }
}
