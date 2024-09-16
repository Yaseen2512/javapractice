import java.util.Scanner;
public class traf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String col=scan.nextLine();
        if (col.equals("red") || col.equals("RED"))
        {
            System.out.println("STOP");
        }
        else if (col.equals("yellow") || col.equals("YELLOW"))
        {
            System.out.println("GET READY");
        }
        else if (col.equals("green") || col.equals("GREEN"))
        {
            System.out.println("GO");
        }
        else{
            System.out.println("the traffic ligth is not in working condition");
        }
    }
}
