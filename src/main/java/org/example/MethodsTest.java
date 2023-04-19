package org.example;

public class MethodsTest {
    int i = 1;
    static int id = 100;

    public void m1(){
        System.out.println("instance m1");
    }


    public String m3(){
       return  "instance m3 ";
    }

//    static {
//        System.out.println("Static block");
//    }
//
//    {
//        System.out.println("instance block");
//    }
    public static void m2(){
        System.out.println("static method");
    }

    public static void main(String[] args) {

        //1st static block
        System.out.println(MethodsTest.id);//static variable

        MethodsTest mt = new MethodsTest(); // obj creation

        mt.m1();                            //instance method - void

        System.out.println(mt.m3());        //instance method - Returns Value

        System.out.println(mt.i);           //instance variable

        MethodsTest.m2();                   //static method


    }
}
