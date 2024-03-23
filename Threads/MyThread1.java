package Threads;

//creating thread using Thread class
public class MyThread1 extends Thread {

    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread from sub class: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
