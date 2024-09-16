import java.util.*;

public class clsmet {
    int num1;
    int num2;


    void add()
    {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=num1+num2;
        System.out.println("hello sana  \n" +num3);
        sub();
    }

    void sub()
    {
        System.out.println("hello");
    }



    public static void main(String[] args) {
        clsmet obj=new clsmet();
        obj.add();
        
        
    }
}
