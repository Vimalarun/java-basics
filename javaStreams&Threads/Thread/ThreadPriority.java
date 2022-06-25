package Thread;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadPriority t = new ThreadPriority();
        Thread t1 = new Thread(t,"First");
        Thread t2 = new Thread(t,"Second");
        Thread t3 = new Thread(t,"Third");

        t1.setPriority(4);
        t2.setPriority(8);
        t3.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
    }
}
