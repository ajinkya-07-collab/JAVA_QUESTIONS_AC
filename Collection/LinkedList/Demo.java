package Collection.LinkedList;

import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        System.out.println(list.get(1));
    }

}
