package Thread;

class someClass
{
    synchronized void someFunc(int no){
        for(int i=1;i<=no;i++){
            System.out.println(no*i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread is Finished");
    }
}

class Thread1 extends Thread{
    someClass c;
    Thread1(someClass c){
        this.c = c;
    }
    @Override
    public void run() {
        c.someFunc(3);
    }
}

class Thread2 extends Thread{
    someClass c;
    Thread2(someClass c){
        this.c = c;
    }
    @Override
    public void run() {
        c.someFunc(5);
    }
}


public class synchronize extends Thread{
    public static void main(String[] args) {
        someClass s = new someClass();
        Thread1 t1 = new Thread1(s);
        Thread2 t2 = new Thread2(s);
        t1.start();
        t2.start();
    }
}
