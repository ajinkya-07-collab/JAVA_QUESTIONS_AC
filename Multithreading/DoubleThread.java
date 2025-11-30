class ThreadDemo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class DoubleThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadDemo td = new ThreadDemo();
        MyThread mt = new MyThread();

        td.start();

        mt.start();

    }
}
