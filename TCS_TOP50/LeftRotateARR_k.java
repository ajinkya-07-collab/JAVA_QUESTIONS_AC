package TCS_TOP50;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotateARR_k {

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        int k = 3;

        List<Integer> list = Arrays.asList(arr);

        Collections.rotate(list, -k); // negative for left rotation

        System.out.println(list);

    }

}
