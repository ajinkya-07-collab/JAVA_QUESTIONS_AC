package TCS;

public class ParkingFee {

    public static double getParkingfee(double hrs) {

        double ParkingFee = 0;

        if (hrs <= 2) {
            ParkingFee = (100 * hrs);
        } else if (hrs <= 5) {
            ParkingFee = (100 * 2 + (hrs - 2) * 50);
        } else {
            ParkingFee = ((100 * 2) + (50 * 3) + (hrs - 5) * 20);
        }
        return ParkingFee;
    }

    public static void main(String[] args) {

        double hrs = 5;
        System.out.println(getParkingfee(hrs));
    }

}
