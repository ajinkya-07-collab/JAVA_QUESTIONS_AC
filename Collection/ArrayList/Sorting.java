package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        System.out.println("------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 6, 2));
        System.out.println(list);

        System.out.println("------------------");

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        System.out.println("------------------");

        Integer[] arr = { 1, 5, 3, 8, 6, 2 };

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }

}
