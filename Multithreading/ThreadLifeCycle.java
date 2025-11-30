class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000); // simulate work
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        System.out.println("State after creation : " + t.getState()); // NEW
        t.start();
        System.out.println("State after start() : " + t.getState()); // RUNNABLE
        Thread.sleep(500); // wait to allow t to enter sleep
        System.out.println("State during sleep : " + t.getState()); // TIMED_WAITING (likely)
        t.join(); // wait for t to finish
        System.out.println("State after completion : " + t.getState()); // TERMINATED
    }
}
