package oops.construc;

import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class Data {
    //instance variables, declaration. a&n are with default values
    int a;
    String n;

    public Data(int a, String n){           //constructor is used to initialize the values
                                        // re-initiliazation of values, when mostly instance and local variable ref are same
        this.a = a;
        this.n = n;
    }

    public Data(int a) {
        this.a = a;
    }

    public Data(){
        //zero arg consturcto. since, we have overrridden this by arg const, we are cresating default const manually
    }     //cmd+opt+/

    public static void main(String[] args) {
        Data d1 = new Data(11,"Teja_IT");           //initializing values to instance v with constructor.
        //Data d1 = new Data()
        System.out.println(d1.a);
        System.out.println(d1.n);

        Data d2 = new Data(9);          //we initialize constructore with zero/any/all instance varaibles of class
        System.out.println(d2.a);
        System.out.println(d2.n);

        Data d3 = new Data();               //this calls zero parameterized constructor
        d3.a = 10;

    }
}
