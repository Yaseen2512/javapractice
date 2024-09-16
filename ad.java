import java.util.*;
public class ad {
    int a;
    int b;
    

    void sum()
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ad obj=new ad();
       
        obj.sum();
        System.out.println("thank you ");
    }
}
