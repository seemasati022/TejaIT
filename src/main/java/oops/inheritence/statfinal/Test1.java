package oops.inheritence.statfinal;

public  final class Test1 extends Test2 {
    //final class.
    //Is-A or Extends is possible only if child class is final. parent class cant be final to use inheritence

    //final String s; //declaration is not possible with final keyword. initialization also must be done
    final String s1 = "seema";
    public static final String s2 = "bruh";

    public final void m1(){                     //when inheritence is allowed, overriding is forbidden.
                                                // final methods cant be overridden
                                                //methods in final class are final
        System.out.println("m1 final method - Test1 class");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1();
    }
}
