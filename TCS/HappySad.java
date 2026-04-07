package TCS;

public class HappySad {

    public static void main(String[] args) {

        double happy = 100;
        double sad = 0;

        for (int i = 0; i < 4; i++) {
            double newHappy = 0.3 * happy + 0.5 * sad;
            double newSad = 0.7 * happy + 0.5 * sad;

            happy = newHappy;
            sad = newSad;
        }

        System.out.println("Happy = " + (int) happy + " " + "Sad = " + (int) sad);

    }

}
