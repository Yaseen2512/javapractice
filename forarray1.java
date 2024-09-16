import java.util.Scanner;

public class forarray1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Read user inputs into the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
