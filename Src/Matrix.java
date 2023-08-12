import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (M)");

        int m = scanner.nextInt();

        System.out.print("Enter the number (N)");

        int n = scanner.nextInt();

        int[][] matrix1 = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

       matrix1[i][j] = random.nextInt(100);

            }

        }

        int[][] matrix2 = new int[n][m];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matrix2[j][i] = matrix1[i][j];

            }

        }

        System.out.println("first array");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix1[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("the second array");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix2[i][j] + " ");

            }

            System.out.println();

        }

    }
}
