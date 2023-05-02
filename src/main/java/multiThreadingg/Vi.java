package multiThreadingg;

import lombok.SneakyThrows;

//data in consistency
//2 object locks
public class Vi implements Runnable{
    /*
    * either we extend thread or impl runnable,
    * we need to create obj for thread and pass the current class obj ref as target to start multithreading
    *
    * synchronized - keyword
    * by adding this to method, it makes sure, it runs 1 thread at a time
    * means while 1 thread is in execution process, it acquires a lock.
    * after the 1st executuion of thread is completed, it release the lock and gives to other thread.
    *
    * but still data consistency is not there. when there are 2 obj locks, data consistency is not achieve
    * synchronized doesnt full ill
    *
    * yield() is used to send a running thread to runnable state
    * */
    @SneakyThrows         //throws InterruptedException
    @Override
    public synchronized void run() {
        int i =10;
        while (i>0) {
            System.out.println(i + "     run      " + Thread.currentThread().getId());
            i--;
        }
        //Thread.yield();

        //Thread.sleep(3000);
    }



    public static void main(String[] args) throws InterruptedException {
        Vi vi = new Vi();
        Thread t1 = new Thread(vi);
        t1.start();
        Thread t2 = new Thread(vi);
        t2.start();
        Thread t3 = new Thread(vi);
        t3.start();

        Vi vi2 = new Vi();
        Thread t4 = new Thread(vi2);
        t4.start();
        Thread t5 = new Thread(vi2);
        t5.start();                     //vi2 threads t4&t5 interrupts or runs parallelly along with t1,t2,t3.
                                    //but which thread runs first has to complete execution and return the lpock to other thread.
    }
}
