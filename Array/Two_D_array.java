package Array;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with the specified rows and columns
        int[][] twoDArray = new int[rows][columns];

        // Get elements for the 2D array
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Display the contents of the 2D array
        System.out.println("2D array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row for better readability
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
