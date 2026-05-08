package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // System.out.println("Enter number of elements:");
        // int n = sc.nextInt();

        // System.out.println("Enter Elements:");
        // for(int i = 0; i<n; i++){
        // int num = sc.nextInt();
        // list.add(num);
        // }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); // [1,2,3,4,5]

        System.out.println(list.get(2)); // 3

        list.remove(4);
        System.out.println(list); // [1,2,3,4]

        list.set(3, 10);
        System.out.println(list); // [1,2,3,10]

        System.out.println(list.contains(10)); // true

        list.add(0, 11);
        System.out.println(list); // [11,1,2,3,10]
    }

}
