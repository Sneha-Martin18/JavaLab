
// Demonstration of Runnable-based thread creation
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running in " + Thread.currentThread().getName());
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main ends.");
    }
}
