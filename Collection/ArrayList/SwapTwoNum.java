package Collection.ArrayList;

import java.util.ArrayList;

public class SwapTwoNum {

    public static void swapnum(ArrayList<Integer> list, int idx1, int idx2) {

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5); // swap with 3 >> idx = 1
        list.add(9);
        list.add(3); // swap with 5 >> idx = 3
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);

        swapnum(list, idx1, idx2);
        System.out.println(list);

    }

}
