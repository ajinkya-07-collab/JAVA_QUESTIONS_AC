package TwoDArray;

import java.util.Scanner;

public class Creation {

    public static boolean Search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " found at index " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        int n_rows = matrix.length;
        int m_column = matrix[0].length;

        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < m_column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < m_column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);

    }

}
