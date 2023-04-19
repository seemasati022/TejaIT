package org.testpkg;

import org.example.VariablesTest;

public class A {
   // static VariablesTest variablesTest = new VariablesTest();

    public static void main(String[] args) {
        VariablesTest variablesTest =new VariablesTest();
        variablesTest.m1();
        System.out.println(variablesTest.name); //accessed outside the pkg when instyance variable is public
    }
}
