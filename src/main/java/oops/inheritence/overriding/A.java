package oops.inheritence.overriding;

public abstract class A {

    public void m1(){
        System.out.println("parent calss - A - m1 method");
    }

    public int m2(int i, int j){
        System.out.println("Parent A-m2 meth");
        return i+j;
    }

    public abstract String m2(String s1, String s2);
}
