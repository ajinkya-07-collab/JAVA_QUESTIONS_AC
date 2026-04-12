import java.util.Scanner;

class PatientArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr size");

        // Input size
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("array elements");

        // Input patient visits
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting in descending order (simple bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("ket to search");

        // Input key to search
        int key = sc.nextInt();

        // Search for index
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Output index
        System.out.println(index);
    }
}