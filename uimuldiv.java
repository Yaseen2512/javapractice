import java.util.Scanner;

public class uimuldiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a*b*c;
        System.out.println("the multiply of the given three numbe is :"+d);
        int e=a+b+c;
        System.out.println("the add of the given three number is :"+e);
        System.out.println(d/e);
    }
}
