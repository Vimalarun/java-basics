package Thread;

public class ThreadEx2 extends Thread {
    @Override
    public void run() {
        System.out.println("New Thread");
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1);

        int ct1 = Thread.activeCount();
        System.out.println(ct1);

        ThreadEx2 ex2 = new ThreadEx2();
        System.out.println(ex2);

        Thread t2 = new Thread(ex2);
        System.out.println(t2);

        int ct2 = Thread.activeCount();
        System.out.println(ct2);

        t2.start();

        int ct3 = Thread.activeCount();
        System.out.println(ct3);
    }
}
