package multiThreadingg;

import oops.inheritence.overriding.B;

public class BankCustomer {
    /*
     * wait()        throws compile time exception -> InterupptedException -> handle with sneakythrows or try/catch or throws dec
     *               illegalMonitorStateException when called this in an normal method.
     *               these 3 are called in synchronized method.
     *               when wait() is invoked, this goes into waiting state.
     *               we need to inform this to come again into running state and complete executuion by calling notify()
     * notify()         has to be called in synchronized methods
     * notifyAll()
     *
     * */

    int bankBlanace = 10000;

    public synchronized void withdraw(int withDreawAmt) throws InterruptedException {
        System.out.println("person came to withdraw  "+withDreawAmt);
        if (withDreawAmt > bankBlanace) {
            System.out.println("no funds, please wait ");
            wait();                 //goes to waiting state
        }
        bankBlanace = bankBlanace - withDreawAmt;           //updating the balancing after withdraw
    }

    public synchronized void deposit(int depositAmt) {
        //notify to withdraw waiting person if deposits are 3 count
        System.out.println("person came to deposit ");
        System.out.println("successfully deposited " + depositAmt);
        bankBlanace = bankBlanace + depositAmt;
        System.out.println("updated bank balance  = "+bankBlanace);
        notify();           //this notifies the wait() to release the lock and complete execution
        System.out.println("notifying all.....");

    }


}
