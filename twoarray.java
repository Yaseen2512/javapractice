import java.util.*;
public class twoarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enetr a number of student :");
        int a=scan.nextInt();
        System.out.print("Enetr a number of subject :");
        int b=scan.nextInt();

        int [][] marks=new int[a][b];
        
        for (int i=1;i<a;i++)
        {   

            for (int j=1;j<=b;j++)
            {   
                
                marks[i][j]=scan.nextInt();
            }
        }

  

    }
    
}
