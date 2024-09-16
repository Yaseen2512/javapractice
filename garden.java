import java.util.*;
public class garden {
    int apple_price;
    int apple_count;

    void tot_money()
    {
        Scanner scan=new Scanner(System.in);
        int apple_price=scan.nextInt();
        int apple_count=scan.nextInt();
        

        System.out.println("the total money for the given apple is :"+(apple_price*apple_count));
    }

    public static void main(String[] args) {
        garden obj=new garden();
        obj.tot_money();
    }
}
