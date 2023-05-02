package core.ifConditions.mathAndString;

public class ShoppingCart {

    int ActualCost;          //instance variable and has 0 by default  //declaration
    int discountPrice;

    public int mobile() {
        int mi = 17000;
        int samsung = 85000;
        ActualCost = mi + samsung;
        System.out.println("Actuall mobile cart value = " + ActualCost);
        discountPrice = discount(ActualCost, Category.mobile);
        System.out.println("Discounted cart value = " + discountPrice);
        int gst = gst(discountPrice, Category.clothes);
        return gst;
    }

    public int cloths() {
        int suit = 25000;
        int salwar = 25000;
        int shoes = 15000;
        ActualCost = suit + salwar + shoes;
        System.out.println("Actual cloths cart value = " + ActualCost);
        discountPrice = discount(ActualCost, Category.clothes);
        System.out.println("discount on cloths value = "+discountPrice );
        int gst = gst(discountPrice, Category.clothes);
        return gst;
    }

    public int electronics() {
        return 0;
    }

    public int discount(int billAmount, String category) {
        int categoryDiscPrice = 0;
        int AmountafterSplOffer =0;

        if (Category.mobile.equals(category)) {
            if (billAmount > 80000) {
                categoryDiscPrice = (ActualCost * 10) / 100;
                System.out.println("offer price for mobiles 10% " + categoryDiscPrice);
                AmountafterSplOffer = ActualCost - categoryDiscPrice;
                System.out.println(" amount after spl disc "+ AmountafterSplOffer);
            }else {
                System.out.println("sorry no offer at this time");
            }
        }else if (Category.clothes.equals(category)){
            if (billAmount > 50000) {
                categoryDiscPrice = (ActualCost * 15) / 100;
                System.out.println("offer price for cloths 15% "+ categoryDiscPrice);
                AmountafterSplOffer = ActualCost - categoryDiscPrice;
                System.out.println("amount after spl disc "+ AmountafterSplOffer);
            }else {
                System.out.println("sorry no offer at this time");
            }
        }
        return AmountafterSplOffer;
    }

    public int gst(int billAmount, String category){
        int AfterAllAdditions =0;
        if (Category.clothes.equals(category)){
            int clothingBillhGstAmount = (discountPrice * 7) / 100;
            System.out.println("GST price = "+clothingBillhGstAmount);
            AfterAllAdditions = clothingBillhGstAmount + discountPrice;
            System.out.println("Bill after addition of GST = "+AfterAllAdditions);
        } else if (Category.clothes.equals(category)) {
            int clothBillWithGstAmount = (discountPrice * 9) / 100;
            System.out.println("GST price = "+clothBillWithGstAmount);
            AfterAllAdditions = clothBillWithGstAmount + discountPrice;
            System.out.println("Bill after addition of GST = "+AfterAllAdditions);
        }else if (Category.electronics.equals(category)) {
            int electronicsBillWithGstAmount = (discountPrice * 15) / 100;
            System.out.println("GST price = "+electronicsBillWithGstAmount);
            AfterAllAdditions = electronicsBillWithGstAmount + discountPrice;
            System.out.println("Bill after addition of GST = "+AfterAllAdditions);
        }
        return AfterAllAdditions;
    }

    public int totalPay() {
        int totalCartValue = mobile() + cloths() + electronics();
        System.out.println("final PAY is = "+totalCartValue);
        return totalCartValue;
    }

    public static void main(String[] args) {
        ShoppingCart shpcrt = new ShoppingCart();
        System.out.println(shpcrt.totalPay());
    }
}
