package oops.inheritence.overloading;

public class OverLoading3 {

    public double m1(int i, double j){
        System.out.println(" m1 method = "+i+" & "+j);
        return i+j;
    }

    public double m1(double i, int s){
        System.out.println("m1 meth with 2 param, but diff order of param as compared to above m1 = "+i+" & "+s);
        return i+s;
    }

    public static void main(String[] args) {
        OverLoading3 ov3 = new OverLoading3();
        ov3.m1(11,12.9);
        ov3.m1(11.87,10);
    }
}
