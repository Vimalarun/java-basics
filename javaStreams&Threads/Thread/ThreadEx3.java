package Thread;
//multitasking with single thread
public class ThreadEx3 extends Thread{
    public int a=10,b=10;

    @Override
    public void run() {
        add();
        sub();
    }

    void add(){
        System.out.println(a+b);
    }

    void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        ThreadEx3 ex3 = new ThreadEx3();
        Thread t = new Thread(ex3);
        t.start();
        System.out.println(Thread.activeCount());
    }
}
