package javaq;

// (a) Runnable interface & (h) 1 to 10 with 2 sec
class NumberRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
            }
        }
    }
}

// (b) Extending Thread class
class SimpleThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

// (g) 100 to 1 with 3 sec
class ReverseThread extends Thread {
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("Reverse Thread: " + i);
            try {
                Thread.sleep(3000); // 3 seconds
            } catch (InterruptedException e) {
            }
        }
    }
}

// Shared resource
class Counter {

    int count = 0;

    // (e) synchronized method
    synchronized void increment() {
        count++;
        System.out.println("Incremented Count: " + count);
    }

    // (f) synchronized block
    void decrement() {
        synchronized (this) {
            count--;
            System.out.println("Decremented Count: " + count);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // (a) Runnable thread
        Thread t1 = new Thread(new NumberRunnable());

        // (b) Thread class
        SimpleThread t2 = new SimpleThread();

        // (d) Thread priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());

        // Start threads
        t1.start();
        t2.start();

        // (c) isAlive() and join()
        System.out.println("t1 is alive: " + t1.isAlive());
        t1.join();
        System.out.println("t1 is alive after join: " + t1.isAlive());

        // (e) and (f) Synchronization
        Counter c = new Counter();
        Thread t3 = new Thread(() -> c.increment());
        Thread t4 = new Thread(() -> c.decrement());

        t3.start();
        t4.start();

        // (g) Reverse thread
        ReverseThread t5 = new ReverseThread();
        t5.start();
    }
}
