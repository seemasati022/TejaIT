package core.abstraction;

public class Zeroda extends NSE {

    @Override
    public void brokerage() {
        System.out.println("zeroda 50/-");
    }

    public void stockInfo() {

    }

    @Override
    public void guideline() {
        System.out.println("zeroda guidelines");
    }

    public static void main(String[] args) {
        Zeroda zeroda = new Zeroda();           //parent class bloacks & constrcutor is also called
        zeroda.stockInfo();
        zeroda.brokerage();
        zeroda.guideline();
    }
}
