package TCS;

public class ConvertTokmph {

    public static void main(String[] args) {

        double dm = 1000;
        double ts = 180;

        double dkm = dm / 1000;
        double th = ts / 3600;

        double speedkmph = dkm / th;

        System.out.println("Speed in kmph = " + speedkmph);

    }

}
