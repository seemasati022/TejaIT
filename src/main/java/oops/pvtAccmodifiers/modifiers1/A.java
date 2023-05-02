package oops.pvtAccmodifiers.modifiers1;

//private class also cant be created
class A {


    private String n ="private";
    private void test(){
        System.out.println("test meth of A class-pvt meth");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n);            //pvt v,m are accessed only with-in the same class.
        a.test();
    }
}
