import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int mul=scan.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(i+"x"+mul+"="+i*mul);
        }
    }
}
