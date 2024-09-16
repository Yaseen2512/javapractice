import java.util.Scanner;
public class swap {
    public static void main (String[]arg) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);



    }
    
}