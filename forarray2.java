import java.util.Scanner;

public class forarray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();
        
        int[] score = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the score of Student " + (i + 1) + ":");
            score[i] = scan.nextInt();  // Store the score in the array
        }
        
        
        System.out.println("The scores of the students are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + score[i]);
        }
    }
}