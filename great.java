import java.util.Scanner;
public class great {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        String result =n1>n2?"the number 1 is big":"the number 2 is big";
        System.out.println(result);
    }
}
