import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomeException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 10 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught : " + e.getMessage());
        }
        System.out.println("End code");
    }

}
