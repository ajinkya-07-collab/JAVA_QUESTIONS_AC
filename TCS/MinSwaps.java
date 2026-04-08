package TCS;

public class MinSwaps {

    public static int minSwaps(int[] a, int[] b) {

        int swaps = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                continue;
            }
            int j = i + 1;
            for (; j < a.length; j++) {
                if (a[j] == b[i]) {
                    break;
                }
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            swaps++;

        }
        return swaps;
    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 50, 40 };
        int[] b = { 50, 20, 40, 10 };

        System.out.println(minSwaps(a, b));
    }

}
