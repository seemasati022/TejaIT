package oops.protAccmodifiers.modifiers1;

public class A {        //protected class cant be created
    public int i = 9;
    protected String name = "protected";

    protected void test() {
        System.out.println("A class -test meth - protected method");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);         //protect v & m are accessed in the same class of same pkg
        a.test();
    }
}
