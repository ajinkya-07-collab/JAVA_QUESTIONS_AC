public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Start Main");

        int arr[] = new int[] { 10, 20, 30, 40, 50 };
        int i = 0;
        for (; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        try {
            System.out.println(arr[i]); // exception
        } catch (Exception e) {
            System.out.println("Chaillya Vachlo");
        }
        System.out.println("End Main");
    }
}
