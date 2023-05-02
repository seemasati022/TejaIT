package oops.inheritence.statfinal;

public class Data1 extends Data2 {

    //static classes cant be created

    static String s1 = "seema";

    //@Override
    /*override is not possible for static methods as they are readily available before the obj creation.
     static is bound to cpmpile time. and overriding is bound to runtime
     we access them without obj. i.e with classname.vn or mn.
     if in same, class, without duplicate name, call vn,mn directly.
      */
    public static void test(){
        System.out.println("static test method of data1");
    }

    public static void main(String[] args) {
        Data1 data1 = new Data1();
        System.out.println(Data1.s1);
        Data1.test();
        Data2.test();
    }
}
