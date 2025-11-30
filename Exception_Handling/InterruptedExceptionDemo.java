public class InterruptedExceptionDemo {

    InterruptedExceptionDemo() {
        System.out.println("in constructor");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("end constructor");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Start Main");
        InterruptedExceptionDemo obj = new InterruptedExceptionDemo();
        try {
            Thread.sleep(3000);
        } catch (Exception e) { // also can write throws either
            e.getMessage();
            ;
        }
        System.out.println("End main");
    }
}
