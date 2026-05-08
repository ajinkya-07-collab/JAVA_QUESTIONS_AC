package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        System.out.println(list);

        System.out.print("[");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ",");
        }
        System.out.print("]");

        System.out.println();
    }

}
