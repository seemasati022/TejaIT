package excepti;

public class Customer {

    int balance = 2000;

    public void payment(int bill) throws InSufficientFunds{

        if (balance>bill){
            System.out.println("transaction successfull");
        }else {
            //System.out.println("insufficent balance");
            //throw new InSufficientFunds();
            //it just calls the empty constructor.

            throw new InSufficientFunds("Add funds to wallet");     //this calls argumented construdor and send this msg to
                                                                    //parent class throwable and sets the value and return it.
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.payment(7000);
        //InSufficientFunds ins = new InSufficientFunds("add balance");
        //Thread.sleep(100,7);
    }
}
