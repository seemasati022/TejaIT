package oops.inheritence.overriding;

public class B extends A {
    @Override
    public void m1(){
        System.out.println("overriding parent A m1 method in B child");
    }

    @Override
    public String m2(String s1, String s2){
        System.out.println("child B - m2 method");
        return s1+s2;
    }

//    public int m2(int i, int k){
//        return i+k;
//    }
    
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        System.out.println(b.m2("ss","sb"));
        System.out.println(b.m2(10,20));
    }
}
