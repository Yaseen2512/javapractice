import java.util.Scanner;
public class biodata {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a name: ");
        String Name=scan.nextLine();
        System.out.print("enter a age: ");
        int Age=scan.nextInt();
        scan.nextLine();
        System.out.print("enter a department: ");
        String Dept=scan.nextLine();
        System.out.print("enter a year: ");
        int Year=scan.nextInt();
        scan.nextLine();
        System.out.print("enter a native: ");
        String Native=scan.nextLine();
        System.out.print("enter a father number: ");
        long Father_num=scan.nextLong();
        System.out.print("enter a mother number: ");
        long Mother_num=scan.nextLong();
        scan.nextLine();
        System.out.print("enter a father occupation: ");
        String Father_occ=scan.nextLine();
        System.out.print("enter a mother occupation: ");
        String Mother_occ=scan.nextLine();
        System.out.print("enter a family income: ");
        int Family_income=scan.nextInt();
        
        System.out.println("The detail of the Student");
        System.out.println("-------------------------");
        System.out.println("The name of the Student :"+Name);
        System.out.println("The age the Student :"+Age);
        System.out.println("The department of the Student :"+Dept);
        System.out.println("The student studying year :"+Year);
        System.out.println("The native of the Student :"+Native);
        System.out.println("Student father number :"+Father_num);
        System.out.println("Student mother number :"+Mother_num);
        System.out.println("Student father occ ;"+Father_occ);
        System.out.println("Student mother occ ;"+Mother_occ);
        System.out.println("The student family income :"+Family_income);


        
        

    }
}
