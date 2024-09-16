import java.util.Scanner;
public class arrayfor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] marks=new int[n];
        for (int i=1;i<=n;i++)
        {
            System.out.print("enter the studet "+ i +" mark: " );
            marks[i]=scan.nextInt();
        }
        for (int i=1;i<=n;i++)
        {
            System.out.println(marks[i]);
        }
    }   
}
