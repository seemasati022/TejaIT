package core.abstraction;

public class UpStocks extends NSE {

    @Override
    public void brokerage() {
        System.out.println("UpStocks 20/-");
    }

    @Override
    public void guideline() {
        System.out.println("upstocx guide");
    }

    public static void main(String[] args) {
        UpStocks up = new UpStocks();
        up.stockInfo();
        up.brokerage();
        up.guideline();
    }
}
