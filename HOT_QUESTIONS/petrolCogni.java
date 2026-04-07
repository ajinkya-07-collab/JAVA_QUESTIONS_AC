public class petrolCogni {

    public static void main(String[] args) {
        // Sample input
        int[] pumpOpen = { 1, 1, 1, 1, 1 };
        int[] petrolPrices = { 1, 2, 3, 4, 5 };
        int interval = 2;
        int numOfVehicles = 5; // Currently unused

        // Call the method to update petrol prices
        int[] result = newPetrolPrices(pumpOpen, petrolPrices, interval, numOfVehicles);

        // Print the final petrol prices using a traditional for loop
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] newPetrolPrices(int[] pumpOpen, int[] petrolPrices, int interval, int numOfVehicles) {
        // Apply price update for each interval
        for (int i = 0; i < interval; i++) {
            for (int j = 0; j < petrolPrices.length; j++) {
                if (pumpOpen[j] == 1) {
                    petrolPrices[j] *= 2;
                }
            }
        }
        return petrolPrices;
    }
}
