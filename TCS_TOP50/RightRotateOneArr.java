package TCS_TOP50;

public class RightRotateOneArr {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int temp = arr[n - 1];

        // ✅ just fix loop direction and indices
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}