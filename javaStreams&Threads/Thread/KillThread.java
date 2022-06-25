package Thread;

public class KillThread extends Thread{
    public static Thread t;
    @Override
    public void run() {
        System.out.println("To stop thread");
        t.stop();
    }

    public static void main(String[] args) {
        KillThread k = new KillThread();
        t = new Thread(k);
        t.start();
    }
}
