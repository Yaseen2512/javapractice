import java.util.Scanner;

public class twoarray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int[][] marks = new int[a][b]; // 2 students, 5 subjects each

        // Input marks for each student
        for (int i = 0; i < a; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j <b; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scan.nextInt();
            }
        }

        // Print the marks
        System.out.println("\nMarks of students:");
        for (int i = 0; i < a; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < b; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);
            }
        }

        scan.close();
    }
}
