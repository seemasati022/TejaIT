package oops.inheritence.overloading;

public class OverLoading2 {
//overloading with same param but different dataType
    public int m1(int i){
        System.out.println(" m1 method = "+i);
        return i;
    }

    public int m1(long i){
        System.out.println(" m1 method = "+i);
        return (int) i;
    }
    public void m1(String s){
        System.out.println(" m1 method = "+s);
        return;
    }

    public static void main(String[] args) {
        OverLoading2 ov2 = new OverLoading2();
        ov2.m1(100);
        ov2.m1(100L);
        ov2.m1("seema");
    }
}
