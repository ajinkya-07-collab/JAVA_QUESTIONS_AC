package TCS;

public class KadanesMaxSubArrSum {

    public static void kadanes(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int start = 0; // start index of max subarray
        int end = 0; // end index of max subarray
        int tempStart = 0; // temporary start index

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1; // start new subarray
            }
        }

        System.out.println("Maximum SubArray SUM = " + maxSum);

        System.out.print("Subarray with max sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(arr);
    }
}