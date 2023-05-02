package multiThreadingg;

import lombok.SneakyThrows;

public class JoinTest {

    /*
     * multiple class can be written outside of main class scope
     * these classes cant be public.
     * these are default
     * these cant run main() withmin them
     * mainclass.java is the parent class and run main method.
     * objects can be created.
     *
     * when we invoke join() -> as soon as that particular thread acquires the lock, it doesnt release untill the executuion is completed.
     *
     *
     * */
    public static void main(String[] args) {
        JoinTest1 j1 = new JoinTest1();
        JoinTest2 j2 = new JoinTest2();
        JoinTest3 j3 = new JoinTest3();
        JoinTest4 j4 = new JoinTest4();

        j1.start();
        try {
            j1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        j2.start();

        j3.start();

        j4.start();
        try {
            j4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class JoinTest1 extends Thread{
    @SneakyThrows
    @Override
    public void run(){
        for (int i=1;i<=15;i++){
        System.out.println(i+ "  j1 method  "+Thread.currentThread().getId());
        //Thread.sleep(1000);
        //System.gc();
        }
    }
    /*public final void join(int i){

    }*/
}
class JoinTest2 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=15;i++){
            System.out.println(i+ "  j2 method  "+Thread.currentThread().getId());}
    }
}

class JoinTest3 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=15;i++){
            System.out.println(i+"  j3 method  "+Thread.currentThread().getId());}
    }
}

class JoinTest4 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=15;i++){
            System.out.println(i+"  j4 method  "+Thread.currentThread().getId());}
    }
}
