import java.util.Scanner;
public class rain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String result=s.equals("rain")?"take the umbrella":"enjoy the sun";
        System.out.println(result);
    }
}
