package core.abstraction;

public abstract class NSE {
/*
* when we want to have non-piublic methods, we choose abstract class
* if we have an agreement to add a method in future, we can add it in abstract instead of interface.
* if we define a method in interface, then all the impl classes should override and provide impl
* */
    public void stockInfo() {          //final alone can be used in unfinal class
        System.out.println("TCS,Infosys,Tata,Zomato");
    }

    public abstract void brokerage();

    public abstract void guideline();

    public static void main(String[] args) {
        // NSE nse = new NSE(); not possible, bcz contains unimpl meth
    }

    NSE() {
        System.out.println("NSC constructo");
    }

    static {
        System.out.println("NSE static bloack");
    }

    {
        System.out.println("NSE instance block");
    }

}
