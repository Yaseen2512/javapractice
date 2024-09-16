import java.util.Scanner;
public class format {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1=scan.nextLine();
        String item2=scan.nextLine();
        String item3=scan.nextLine();

        int quantity1=scan.nextInt();
        int quantity2=scan.nextInt();
        int quantity3=scan.nextInt();

        int price1=scan.nextInt();
        int price2=scan.nextInt();
        int price3=scan.nextInt();

        System.out.println("item:"+item1+"\t Quantity:"+quantity1+"\t price:"+price1*quantity1);
        System.out.println("item:"+item2+"\t Quantity:"+quantity2+"\t price:"+price2*quantity2);
        System.out.println("item:"+item3+"\t Quantity:"+quantity3+"\t price:"+price3*quantity3);
    }
}
