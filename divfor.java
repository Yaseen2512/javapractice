import java.util.Scanner;
public class divfor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=0;
        for (int i=a;i<b;i++)
        {
            if (i%3==0 && i%5==0)
            {
                count=count+1;
                System.out.println("the number dividible by 3 and 5 : "+i);
            }
        }
        System.out.println(count);
    }
}
