import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a mark :");
        int mark=scan.nextInt();
        System.out.println((mark>=45)?"PASS":"FAIL");

    }
}
