package TCS_TOP50;

public class OnePlaceLeftArrRotate {

    public static void leftRotateArrByOne() {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

    }

    public static void leftRotateArrByOneString() {

        String str = "ajinkya";
        char[] ch = str.toCharArray();

        char temp = ch[0];

        for (char i = 1; i < ch.length; i++) {
            ch[i - 1] = ch[i];
        }
        ch[ch.length - 1] = temp;

        for (char i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        leftRotateArrByOne();
        leftRotateArrByOneString();

    }

}
