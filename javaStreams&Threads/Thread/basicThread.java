package Thread;

public class basicThread extends Thread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.activeCount());

    }

}
