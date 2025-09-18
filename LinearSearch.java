
import java.util.Scanner;

class LinearSearch {

    // 📌 Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return the index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int x = sc.nextInt();

        // 🧠 Call the method
        int index = linearSearch(numbers, x);

        if (index != -1) {
            System.out.println(x + " is at index " + index);
        } else {
            System.out.println(x + " not found in array");
        }

        sc.close();
    }
}
