import java.util.Scanner;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
public class days {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int day=scan.nextInt();
        if (day==1 && day<2)
        {
            System.out.println("day "+day+ " Sunday");
        }
        else if (day==2 && day<3)
        {
            System.out.println("day "+day+ " Monday");
        }
        else if (day==3 && day<4)
        {
            System.out.println("day "+day+ " Tuesday");
        }
        else if (day==4 && day<5)
        {
            System.out.println("day "+day+ " Wednesday");
        }
        else if (day==5 && day<6)
        {
            System.out.println("day "+day+ " Thursday");
        }
        else if (day==6 && day<7)
        {
            System.out.println("day "+day+ " Friday");
        }
        else if (day==7 && day<8)
        {
            System.out.println("day "+day+ " Saturday");
        }
        else 
        {
            System.out.println("Enter the correct number 1 to 7");
        }
    }
}
