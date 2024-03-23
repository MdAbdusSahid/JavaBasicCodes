package Threads;

class UserThread implements Runnable {
    public void run() {
        System.out.println("User defined thread implementing Runnable Interface");
    }
}

class UserThread1 extends Thread {
    public void run() {
        System.out.println("User defined thread extending Thread class");
    }
}


public class ThreadOp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Started...");
        int x = 50 + 40;
        System.out.println("sum of x is: " + x);

        Thread t = Thread.currentThread();
        String tName = t.getName();

        System.out.println("Current running thread is: " + tName);
        t.setName("MyMainThread");
        System.out.println(t.getName());
        System.out.println(t.threadId());
        Thread.sleep(1000);
        System.out.println("Program ended...");
        UserThread userThread = new UserThread();
        Thread th = new Thread(userThread);
        userThread.run();

        UserThread1 th1 = new UserThread1();
        th1.start();

    }
}
