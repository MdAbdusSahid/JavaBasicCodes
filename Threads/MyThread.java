package Threads;

//creating thread using Runnable Interface
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread from main class: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        thr.start();

        MyThread1 mtr = new MyThread1();
        mtr.start();
    }
}
