package oops.protAccmodifiers.modifiers2;

import oops.protAccmodifiers.modifiers1.A;

public class C extends A{       //to access protected v, m of any class, we need to exteds to that class.

    public static void main(String[] args) {
        // A a  = new A();
        C c = new C();
        System.out.println(c.name);         //protect v & m are accessed in the different class of same pkg
                                            // ONLY WHEN THIS CLASS IS SUB CLASS OF A CLASS
        c.test();



        C c1 = new C();
        System.out.println(c1.name);

    }

}
