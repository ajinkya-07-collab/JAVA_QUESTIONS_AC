package TCS_TOP50;

public class LargestOfThree {

    public static int largestOfThree(int a, int b, int c) {
        int largest = a;
        if (largest < b) {
            largest = b;
        }
        if (largest < c) {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        int a = 14, b = 24, c = 12;

        System.out.println(largestOfThree(a, b, c));

    }

}
