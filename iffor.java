import java.util.Scanner;
public class iffor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int oddcount=0;
        int evencount=0;
        for (int i=a;i<=b;i++)
        {
            if (i%2==0)
            {
                evencount=evencount+1;
                System.out.println("even number: "+i);
            }
            else 
            {
                oddcount=oddcount+1;
                System.out.println("odd number: "+i);
            }
            
        }
        System.out.println(evencount);
        System.out.println(oddcount);

    }
}
