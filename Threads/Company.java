package Threads;

public class Company {
    int n;
    boolean f = false;

    synchronized public void consumeItem() throws InterruptedException {
        if (!f)
            wait();

        System.out.println("Consume   : " + n);
        f = false;
        notify();
    }

    synchronized public void produceItem(int n) throws InterruptedException {
        if (f)
            wait();

        this.n = n;
        System.out.println("Produced  : " + n);
        f = true;
        notify();

    }
}
