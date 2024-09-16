import java.util.Scanner;
public class forarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number of student :");
        int n=scan.nextInt();
        int [] score=new int[n];
        for (int i=0;i<=n;i++)
        {
            
            System.out.println("enter a score of Student :"+(i+1) + ":");
            score[i] = scan.nextInt(); 
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("the score of the "+n + " Student are:");
            System.out.println("student_" +(i+1)+ ":" + score[i]);
        }
    }
}
