package multiThreadingg;

import lombok.SneakyThrows;

public class BankCustomerImpl {

    /*
    * calling Bankcustomer here
    *
    * crating anonymous class of thread
    *
    *
    * */

    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer();
        new Thread() {
            //@SneakyThrows
            @Override
            public void run(){
                try {
                    bankCustomer.withdraw(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run(){
                bankCustomer.deposit(30000);
        }
        }.start();
        //new Thread(() -> bankCustomer.deposit(30000)).start();
    }
}
