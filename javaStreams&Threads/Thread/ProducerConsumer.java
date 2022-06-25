package Thread;

import java.util.Queue;
import java.util.LinkedList;

class SampleBuffer{
    public static Queue<Integer> q;
    public static int size;

    public SampleBuffer(int size){
        this.q = new LinkedList<>();
        this.size = size;
    }

    public void produce() throws InterruptedException {
        int value = 0;
//        while (true){
            synchronized(this){
                while(q.size() >= size) {
                    wait();
                }
                q.add(value);
                System.out.println("Added Item "+value);
                value++;
                notify();//notify consumer
                Thread.sleep(1000);
            }
        }
//    }

    public void consume() throws InterruptedException {
//        while (true){
            synchronized (this){
                while (q.size() == 0){
                    wait();
                }
                int item = q.poll();
                System.out.println("Removed item: "+item);
                notify();
                Thread.sleep(1000);
            }
        }
    }
//}

class Thread01 extends Thread {
    public SampleBuffer s;
    Thread01(SampleBuffer s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            int i=0;
            while(i<10){
                s.produce();
                i++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread02 extends Thread{
    public SampleBuffer s;
    Thread02(SampleBuffer s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            int i=0;
            while(i<10){
                s.consume();
                i++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        SampleBuffer s = new SampleBuffer(5);
        Thread01 a = new Thread01(s);
        Thread02 b = new Thread02(s);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
    }
}
