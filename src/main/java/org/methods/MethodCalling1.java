package org.methods;

public class MethodCalling1 {

    public int m1(){
        return 10;
    }
    public int m2(){
        return 20;
    }
    public int m3(){
        return 30;
    }

    public static void main(String[] args) {
        MethodCalling1 methodCalling1 = new MethodCalling1();
        int val1 = methodCalling1.m1();
        int val2 = methodCalling1.m2();
        int val3 = methodCalling1.m3();
        int total = val1 + val2 + val3;
        System.out.println(total);

    }
}
