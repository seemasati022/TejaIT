package oops.inheritence.overloading;

public class OverLoading1 {

    public void m1(){
        System.out.println("m1 method");
    }

    public void m1(int i){
        System.out.println("m1 method with 1 param " +i);
    }

    public void m1(int i, String s){
        System.out.println("m1 meth with 2 param  "+i+s);
    }

    public void m1(String s, int i){
        System.out.println("this m1 method is with 2 params, but diff order of datatypes");
        System.out.println("m1 meth with 2 param  "+i+s);
        System.out.println("m1 meth with 2 param  "+s+i);
    }

    public void m1(int i, int j){
        System.out.println("m1 meth with 2 param  "+ i+j);
    }

    public static void main(String[] args) {
        OverLoading1 or = new OverLoading1();
        or.m1();                        // calls 1st m1 meth with zero args
        or.m1(11);                   // calls 2nd m1 method with single arg
        or.m1(1,"ss");            // calls 3rd m1 method with two different arg
        or.m1("name",20);         // calls 4th m1 method with 2 args but with different order of dt //change in sequence of params
        or.m1(10,100);            // calls 5th m1 method with 2 args but with different dt.
    }
}
