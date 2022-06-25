package Thread;

public class controlSwitches extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        controlSwitches c1 = new controlSwitches();
        Thread t1 = new Thread(c1);
        controlSwitches c2 = new controlSwitches();
        Thread t2 = new Thread(c2);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
    }
}
