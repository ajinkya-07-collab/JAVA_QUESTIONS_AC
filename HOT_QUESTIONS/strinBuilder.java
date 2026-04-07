public class strinBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at insex 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert at insex 0
        sb.insert(0, "S");
        System.out.println(sb);

    }
}
