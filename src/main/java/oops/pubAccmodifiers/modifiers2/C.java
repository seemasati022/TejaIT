package oops.pubAccmodifiers.modifiers2;

import oops.pubAccmodifiers.modifiers1.A;

public class C {
    public static void main(String[] args) {
        //calling A class public v & m in modifiers2 pkg by creating obj.
        A a = new A();      // to access instance v and method
        System.out.println(a.n);
        a.test();
    }
}
