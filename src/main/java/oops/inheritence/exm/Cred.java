package oops.inheritence.exm;

public class Cred extends BillDesk {

    public static void coupons(){
        System.out.println("cred coupons");
    }
    public void loans(){
        System.out.println("Cred loans");
    }

    public void shopping(){
        System.out.println("Cred shopping");
    }

    public final void cibilScore(){
        System.out.println("Cred cibilReport");
    }

    public static void main(String[] args) {
        Cred.coupons();
        Cred cred = new Cred();
        cred.loans();
        cred.shopping();
        cred.cibilScore();
        //cred require PG, so inherit from Billdesk pg. to do-extends billdesk
        cred.payments();
    }}
