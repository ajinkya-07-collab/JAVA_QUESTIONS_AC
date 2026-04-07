package TCS;

public class FrequencyNumber {

    public static void getFrequency(int[] arr) {

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // update min max frequency
            if (count < minFreq) {
                minFreq = count;
            }
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        System.out.println("MIN FREQUENCY : " + minFreq);
        System.out.println("MAX FREQUECY : " + maxFreq);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 3, 3, 4 };
        getFrequency(arr);

    }

}
