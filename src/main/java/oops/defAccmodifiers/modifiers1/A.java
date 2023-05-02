package oops.defAccmodifiers.modifiers1;

class A {
    String n = "deafult";
    void test(){
        System.out.println("A-class Test method - default accmod");
    }
    public static void main(String[] args) {
        A a = new A();      // to access instance v and method
        System.out.println(a.n);
        a.test();
    }
}
