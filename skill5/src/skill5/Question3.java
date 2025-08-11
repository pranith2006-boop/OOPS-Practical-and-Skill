package skill5;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                rowSum[i] = rowSum[i] + matrix[i][j]; 
                colSum[j] = colSum[j] + matrix[i][j]; 
            }
        }
        
        System.out.println("Row sums:");
        for (int i = 0; i < n; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
        }
        
        System.out.println("Column sums:");
        for (int j = 0; j < n; j++) {
            System.out.println("Column " + (j + 1) + ": " + colSum[j]);
        }
        
        sc.close();
    }
}
