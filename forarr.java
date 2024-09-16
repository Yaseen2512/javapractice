import java.util.Scanner;
public class forarr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int[] mark=new int[5];
        for (int i=0;i<=4;i++)
        {
            mark[i]=scan.nextInt(); 
        }
        for (int j=0;j<=4;j++)
        {
            System.out.print("Enter a index value :");
            int n=scan.nextInt();
            if (n<5)
            {
                    System.out.println(mark[n]);
            }
            else 
            {
                System.out.println("byee..");
            }
        }
            
        
        
    }
}
