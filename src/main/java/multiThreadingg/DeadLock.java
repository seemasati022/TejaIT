package multiThreadingg;

public class DeadLock {

/*
* This deadlock condition works only when we write synchronized block inside overridden run method.
* doesnt work with lambda.
* */
    public static void main(String[] args) {
        String lock1 = "ganesh";
        String lock2 = "gowtham";
        //anonymous inner thread class

        /*new Thread(
            () -> {
                synchronized (lock1){
                    System.out.println("t1 acquired lock1 "+ lock1 );
                    synchronized (lock2){
                        System.out.println("t1 acquired lock1 "+ lock2 );
                    }
                }
        }
        ).start();

        new Thread(
                () -> {
            synchronized (lock2){
                System.out.println("t2 acquired lock2 "+ lock2 );
                synchronized (lock1){
                    System.out.println("t2 acquired lock2 "+ lock1 );
                }
            }
        }
        ).start();
        */

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("t1 acq " + lock1);
                    synchronized (lock2) {
                        System.out.println("t1 acq " + lock2);
                    }
                }
            }
        };
        t1.start();

        Thread t2 =new Thread() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("t2 acq " + lock2);
                    synchronized (lock1) {
                        System.out.println("t2 acq " + lock1);
                    }
                }
            }
        };
        t2.start();

    }

}
