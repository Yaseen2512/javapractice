import java.util.*;
public class clsstd {
    String name;
    int rollno;
    int a;
    int[] marks=new int[a];


    int mark_tot()
    {
        int sum=0;
        for (int x:marks)
        {
            sum +=x;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        clsstd obj=new clsstd();
        System.out.print("Enter a number of student :");
        int n=scan.nextInt();
        System.out.println("Enter the number of subject :");
        obj.a=scan.nextInt();
        
        for (int i=1;i<=n;i++)
        {
            
            System.out.println("Enter the Student "+(i++) +" details");
            obj.name=scan.nextLine();
            scan.nextLine();
            obj.rollno=scan.nextInt();
            for (int j=1;j<=obj.a;j++)
            {
                obj.marks[j]=scan.nextInt();
            }
            System.out.println(obj.mark_tot());

        }

    }


}
