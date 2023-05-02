package core.ifConditions.mathAndString;

public class Shopping {
    int totalActualVal;
    int discountPrice;
    int totalPayable;
    int finalPay;

    public int mobiles() {
        int vivo = 5000;
        int samsung = 10000;
        totalActualVal = vivo + samsung;
        System.out.println("total mobiles bills without any disc " + totalActualVal);
        discountPrice = (totalActualVal * 5) / 100;
        System.out.println("discount value " + discountPrice);
        totalPayable = totalActualVal - discountPrice;
        System.out.println("total mobile bill after discount " + totalPayable);
        return totalPayable;
    }

    public int cloths() {
        int shirt = 5000;
        int jeans = 1000;
        totalActualVal = shirt + jeans;
        System.out.println("total cloths bills without any disc " + totalActualVal);
        discountPrice = (totalActualVal * 10) / 100;
        System.out.println("discount value " + discountPrice);
        totalPayable = totalActualVal - discountPrice;
        System.out.println("total cloths bill after discount " + totalPayable);
        return totalPayable;
    }

    public int kids() {
        int crawler = 12000;
        int toys = 10000;
        totalActualVal = crawler + toys;
        System.out.println("totoal kids bills without any disc " + totalActualVal);
        discountPrice = (totalActualVal * 20) / 100;
        System.out.println("discount value " + discountPrice);
        totalPayable = totalActualVal - discountPrice;
        System.out.println("total kids bill after discount " + totalPayable);
        return totalPayable;
    }

    public int totalShopping() {
        int totalCartValue = cloths() + kids() + mobiles();
        int billAfterTotALDISC = 0;
        if (totalCartValue >= 10000 && totalCartValue< 20000) {
            System.out.println("ur bill is above 10k, you got 10% disc");
            billAfterTotALDISC = (totalCartValue * 10) / 100;
            System.out.println("final disc amount value " + billAfterTotALDISC);
            finalPay = totalCartValue - billAfterTotALDISC;
            System.out.println("please pay "+finalPay);
        } else if (totalCartValue>20000) {
            System.out.println("ur bill is above 20k, you got 20% disc");
            billAfterTotALDISC = (totalCartValue * 20) / 100;
            System.out.println("final disc amount value "+ billAfterTotALDISC);
            finalPay = totalCartValue - billAfterTotALDISC;
            System.out.println("please pay "+finalPay);
        }
        return finalPay;

    }
/**
    public int discount(int amount, String category) {
        int BillAfterFinalDisc = 0;
        if (category.equals(Category.clothes)) {          //if total bill is > 5k, flat 10%
            if (totalShopping() > 20000) {
            }
        } else if (amount > 2000 && category.equals(Category.kids)) {
            System.out.println("you availed 5% discount");
            // discountPrice = shopping.kids()
            //int amt = shopping.kids();
            //totalPayable  = (amt * 12) / 100;
        } else if (amount > 7000 && Category.mobile.equals(category)) {
            System.out.println("your total shopping bill is above 7000, so you availed extra 10% discount");
            int amt = totalShopping();
            BillAfterFinalDisc = (amt * 10) / 100;
            //finalBill = finalBill - a;
        } else {
            System.out.println("pay full");
        }
        return BillAfterFinalDisc;
    }
**/

    public static void main(String[] args) {
        Shopping shp = new Shopping();
        System.out.println(shp.totalShopping());
        //System.out.println(shp.mobiles());
    }
}
