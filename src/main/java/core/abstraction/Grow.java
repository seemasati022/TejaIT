package core.abstraction;

public class Grow extends NSE {

    @Override
    public void brokerage() {
        System.out.println("Grow 25/-");
    }

    @Override
    public void guideline() {
        System.out.println("grow guide");
    }

    public static void main(String[] args) {
        Grow grow = new Grow();
        grow.stockInfo();       //acquired from parent which is impl method in abstract class
        grow.guideline();
    }
}
