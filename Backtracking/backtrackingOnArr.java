package Backtracking;

public class backtrackingOnArr {

    public static void changeArr(int[] arr, int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr, val);
            return;
        }

        // recusrion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int[] arr, int i) {
        if (i == arr.length)
            return;

        System.out.print(arr[i] + " ");
        printArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);

    }

}
