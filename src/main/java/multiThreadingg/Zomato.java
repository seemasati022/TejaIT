package multiThreadingg;

public class Zomato extends Thread{
    /*
    *
    * static synchronized -> data consistency        -> to method
    * only synchronized -> data in-consistency       -- both - performance less
    *
    * instead of applying for whole method and creating obj level locking, we can choose synchronized block.
    *
    * synchronized {} to particular piece of coide, high performance.
    *
    *
    * */

    @Override
    public void run(){
        order();
    }

    public void order(){            //by applying synchronized to method or object level lock, we get less performance.
        //by applying syncronized to a particular code, we can get more performance.

        for (int i = 0; i<=10; i++){
            System.out.println("order  "+ Thread.currentThread().getId());
        }
        //static
        synchronized(this){
            for (int i = 0; i <= 10; i++) {
                System.out.println("block      ,,,,,,, " + Thread.currentThread().getId());
            }
        }
    }

    public static void main(String[] args) {
        Zomato z1 = new Zomato();
        Thread t1 = new Thread(z1);
        t1.start();
        Thread t2 = new Thread(z1);
        t2.start();
        Thread t3 = new Thread(z1);
        t3.start();
    }
}
