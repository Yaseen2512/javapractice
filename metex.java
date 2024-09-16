// example for usong the methd with the static to static method and passing the argument 

import java.util.*;
public class metex {

    static double  volume(double l, double  b, double  h)  // method header 
    { // method definition
        double vol;
        vol=l*b*h;
        //System.out.println("the volume of the given measuremet is :"+vol);
        return vol; //this method is used while the return type is mention 
        // or 
        // return l*b*h; used for the above code also 
    }

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        int b=scan.nextInt();
        int h=scan.nextInt();
        
        volume(l,b,h); // it works because the method is static and the main function is also static 
        //volume(10,2,1);
        //metex obj=new metex();// while use in the non static to static method 
        //obj.volume(l, b, h);// this is also used whie the non static method object for the static method 

        double vo=volume(l,b,h );// passing arguments 
        double vo1=volume(10,2,1);
        System.out.println(vo);
        System.out.println(vo1);

        // we can also pass the argument directly through the print statement 
        //ex= System.out.prontln(volume(1,1,1));

    }
}
