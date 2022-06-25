package Thread;

class A extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("A Thread");
    }
}

class B extends Thread{
    @Override
    public void run() {
        System.out.println("B Thread");
    }
}

public class joinThread {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread t1 = new Thread(a);

        B b = new B();
        Thread t2 = new Thread(b);

        t1.start();
        t1.join();
        t2.join();
        System.out.println("Thread execution");
        t2.start();

    }
}
