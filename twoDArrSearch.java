import java.util.Scanner;

class twoDArr{

    // Method to search for a target in a 2D array
    public static void search(int[][] arr, int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println(target + " is at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(target + " not in array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        search(numbers, x);
    }
}
