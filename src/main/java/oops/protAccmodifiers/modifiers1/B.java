package oops.protAccmodifiers.modifiers1;

public class B {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);         //protect v & m are accessed in the different class of same pkg
        a.test();
        System.out.println(a.name);
    }
}
