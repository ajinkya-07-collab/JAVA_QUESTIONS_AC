public class ThreadDemo extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start MAIN");
        System.out.println(Thread.currentThread().getName());
        System.out.println("#######");

        ThreadDemo obj = new ThreadDemo();
        obj.start();

        // Thread.sleep(1);

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
