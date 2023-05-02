package multiThreadingg;

import core.methods.A;
import lombok.SneakyThrows;

public class Airtel extends Thread {
    /*
    * lifeCycle of thread
    *
    * new or born           Thread t = new Thread(current class ref)
    * runnable              t.start()
    * running               internally run() is called
    * waiting/sleeping      if we invoke with sleep()/wait()
    * dead                  run() execution completed
    *
    * */


    @SneakyThrows
    @Override
    public void run(){
        for (int  i =1; i<=10;i++){
            System.out.println(i + "Airtel run method  "+Thread.currentThread().getId());
        }

//        try {
            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void main(String[] args) {
        Airtel a = new Airtel();
        Thread t1 = new Thread(a);  //this thread class obj takes in target of current class airtel obj
        t1.start();                 //start() internally calls run()
        Thread t2 = new Thread(a);      //runs 2 threads parallelly
        t2.start();

        /*
        t1.start(); //we cant call a dead thread throws us illegalthreadstateexception
        t1.start();
        */
    }

}
