class InvalidAgeException extends Exception {
    InvalidAgeException(String Message) {
        super(Message);
    }
}

public class practice {

    public static void checkage(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Not eleigible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkage(age);
        } catch (InvalidAgeException ive) {
            System.out.println(ive.toString());
        }
    }
}