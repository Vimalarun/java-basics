package Thread;

public class SleepThread extends Thread{
    @Override
    public void run() {
        System.out.println("Dummy Thread");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finished");
    }

    void printMessage(){
        System.out.println("Something");
    }

    public static void main(String[] args) {
        SleepThread s = new SleepThread();
        Thread t = new Thread(s);
        t.start();
        s.printMessage();
    }
}
