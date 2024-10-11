import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = scanner.nextInt();
        
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] mul = new int[r][c];

        System.out.println("Enter the first matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the second matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Multiplication of the matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
