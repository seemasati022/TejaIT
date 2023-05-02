package multiThreadingg;

public class Jio extends Thread implements Runnable {
    /*
    * Multi-threading - to have high performance, we process multpile threads at same time
    * 2 ways - extends -> Thread, implements -> Runnable
    * in which ever way, we have to override run().
    * to achieve multi-threading, we need to invoke a method using Thread.start().
    * this start() internally calls the run() and process threads concurrently.
    *
    * there may be any number of threads, we cant get the order of threads which goes first or ends.
    * we can see the threads by Thread.currentThread().getId()
    *
    * when we make the method synchronized, one thread completes all the work and gives next thread the chance.
    * even here, we cant get which thread takes the 1st chance.
    * */

    @Override
    public void run(){

        for (int  i = 0; i<16 ; i++){
            System.out.println("run thres =  "+ i +"     "+ Thread.currentThread().getId());
        }

    }

    public static void main(String[] args) {
        Jio jio = new Jio();
        Thread t1 = new Thread(jio);
        t1.start();
        Thread t2 = new Thread(jio);
        t2.start();
        t2.stop();
        Thread t3 = new Thread(jio);
        t3.start();

    }

}
