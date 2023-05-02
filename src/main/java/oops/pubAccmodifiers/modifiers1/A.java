package oops.pubAccmodifiers.modifiers1;

/*
Access modifiers
 */
public class A {
    // Public a.m can be applied to Class, Variable, method and can be accessed anywhere in the project.

    public String n = "seema";

    public void test(){
        System.out.println("A class - test method");
    }

    public static void main(String[] args) {
        A a = new A();      // to access instance v and method
        System.out.println(a.n);
        a.test();
    }
}
