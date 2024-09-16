import java.util.*;
public class clsvar {
      
    int h;
    int b;
    int l;

    int box_vol()
    {
        return l*b*h;
    }

    public static void main(String[] args)
    {
        clsvar obj=new clsvar();
        Scanner scan=new Scanner(System.in);
        obj.l=scan.nextInt();
        obj.b=scan.nextInt();// while get the user input for the class variabe we should mention the object and then mention the variable 
        obj.h=scan.nextInt();
        System.out.println(obj.box_vol());

        clsvar obj1=new clsvar();
        obj1.l=scan.nextInt();
        obj1.b=scan.nextInt();// while get the user input for the class variabe we should mention the object and then mention the variable 
        obj1.h=scan.nextInt();
        System.out.println(obj1.box_vol());
     
    }
}