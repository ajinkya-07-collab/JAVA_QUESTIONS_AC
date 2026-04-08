package TCS_TOP50;

public class SumOfDigits {

    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num != 0) {
            int digit_rem = num % 10;
            sum += digit_rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int num = 153;
        System.out.println(sumOfDigits(num));

    }

}
