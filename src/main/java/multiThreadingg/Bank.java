package multiThreadingg;

import oops.inheritence.overriding.B;

public class Bank implements Runnable {
    /*
     * static synchronized -> data consistency but low performance
     *
     *
     * we can make run() alone synchronized but we cant get data consistency
     *
     * object level locking
     * which makes 1 single thread to process completly and followed by next
     * data inconsistency is still there using synchronized
     *
     * making static synchronized, class level locking is done
     * all threads execute 1 after other irrespective of no. of objects
     *
     * t2.notifyAll();           this is used only when we invoke wait()
     *
     * when we choose static sync ->  class level locking, one after other thread is proccessed.
     * less performance
     * */

    @Override
    public void run() {
        deposit();
        Bank.deposit();
    }

    public static synchronized void deposit() {
        //int i =10;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  deposit  " + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank();
        Thread t1 = new Thread(b1);
        t1.start();
        Thread t2 = new Thread(b1);
        t2.start();

        Bank b2 = new Bank();
        Thread t3 = new Thread(b2);
        t3.start();
        Thread t4 = new Thread(b2);
        t4.start();
    }
}
