import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int m3=scan.nextInt();
        int m4=scan.nextInt(); 
        int m5=scan.nextInt();
        int tot=m1+m2+m3+m4+m5;
        int avg=tot/5;
        System.out.println("the avg:"+avg);
      
        if(avg>=90)
        {
            System.out.println("Grade 'A'");
        }
        else if (avg>=70 && avg<90)
        {
            System.out.println("Grade 'B'");
        }
        else if (avg>=50 && avg<70)
        {
            System.out.println("Grade 'C'");
        }
        else if (avg>=35 && avg<50)
        {
            System.out.println("Grade 'D'");
        }
        else 
        {
            System.out.println("Grade 'Fail'");
        }
    
        
        

    }
}
