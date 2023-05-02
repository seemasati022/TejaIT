package oops.defAccmodifiers.modifiers1;

class B {
    //default class v,m are access in other clkass of same pkg
    public static void main(String[] args) {
        A a = new A();      // to access instance v and method
        System.out.println(a.n);
        a.test();
    }
}
