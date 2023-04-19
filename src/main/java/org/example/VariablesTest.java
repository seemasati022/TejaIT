package org.example;

public class VariablesTest {


   public String name = "instance variable"; //Instance V, Class level, Scope: Inside Class & Outside Method, memory:heap, To call we need obj
    static String staticName = "static variable"; //Static v, Instance Variable with Static Keyword, no obj creation is required

    public void m1(){
        int i = 0; //local varable, Scope: Method level, memory: stack, to call obj ref. method name
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(VariablesTest.staticName);   //static v
        VariablesTest vt = new VariablesTest();         //obj creation
        System.out.println(vt.name);                    //instance v
        vt.m1();                                        //local v
    }
}
