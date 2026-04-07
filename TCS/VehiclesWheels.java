package TCS;

public class VehiclesWheels {

    public static void vehicleCount(int vehicles, int wheels) {

        if (wheels % 2 != 0 || wheels < 2 * vehicles || wheels > 4 * vehicles) {
            System.out.println("Invalid Input");
        }

        int cars = (wheels - 2 * vehicles) / 2;
        int bikes = vehicles - cars;

        System.out.println("cars = " + cars);
        System.out.println("Bikes = " + bikes); // equation formation on whatsapp photo
    }

    public static void main(String[] args) {

        int vehicles = 10;
        int wheels = 28;

        vehicleCount(vehicles, wheels);
    }

}
