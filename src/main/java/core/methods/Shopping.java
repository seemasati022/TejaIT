package core.methods;

public class Shopping {

    public int mobiles(){
        int mi = 10000;
        int oppo = 12000;
        int vivo = 15000;
        return mi + oppo + vivo;
    }

    public int dresses(){
        int shirts = 2000;
        int jeans = 6000;
        return shirts + jeans;
    }

    public int totalCartValue(){
        Shopping shopping = new Shopping();         //creates obj
        int mobilesValue = shopping.mobiles();      //calls 5th(mobiles method)and returns 10th(return stmt)
        int dressesValue = shopping.dresses();      //calls 13th & returns 17th
        int totalCartValue = mobilesValue + dressesValue;
        return totalCartValue;
    }

    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        System.out.println(shopping.totalCartValue());  //calls 20th
    }
}
