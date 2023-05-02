package oops.pubAccmodifiers.modifiers2;

import oops.pubAccmodifiers.modifiers1.A;

public class D {

    public static void main(String[] args) {
        A a = new A();      // to access instance v and method
        System.out.println(a.n);
        a.test();
    }
}
