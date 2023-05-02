package oops.inheritence.exm;

import oops.pubAccmodifiers.modifiers2.C;

public class Hdfc extends Cred{
   @Override
    public void loans(){
        System.out.println("Hdfc loans");
    }

/*    // @Override
    public void loans(int i){
        System.out.println("Hdfc loans");
    }
*/

    @Override
    public void shopping(){
        System.out.println("Hdfc shopping");
    }

/*    public void cibilScore(){
        this is not possible to override bcz it is final in parent class
    }
*/

    public static void main(String[] args) {
        Hdfc hdfc = new Hdfc();
        hdfc.cibilScore();
        hdfc.loans();
        hdfc.shopping();
        hdfc.loans();
        hdfc.shopping();
        //hdfc req cibil. acquire from cred using inheritence
        //cred coupon() cant be inherited by hdfc.
        hdfc.cibilScore();
        //hdfc also req payments. since billdesk is already inherited by cred, we can use
        hdfc.payments();
       /* Cred cred = new Cred();
        cred.loans();*/
    }
}
