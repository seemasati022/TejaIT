package core.allvariablesExm;

public class Variables1 extends Variables2{

    int i;      //declaration   //def val = 0       //either we have to initialize @ the time of decalration or initialization must be done in local/constructor/setter.
    //i = 10; // cant be initialized in this scope
    int cid = 200;  // instance variable
    static double amount  = 999.08;     //ststic variable
    String city = "Hyderabad";

    static String name = "akshai";

    public void test1(){
        //Variables1.s1;            calling static variable in non-static/instance method is not possible
        i = 20;     //initialization        //instance variables can be access w.o obj in same class
        System.out.println(i);
        i=30;       //re-initialization
        System.out.println(i);
        System.out.println(cid);
        double amount = 4.9;
        System.out.println(amount);         //local variable is called and preference is given 1st.
                                            //unless, this test1 meht is static, we cant create static v in this class
        System.out.println(this.amount);         //static variables also can be access w.o cn in same class & to access
                                                //class variable, use this.variable name
        String city = " bangalore";
        System.out.println(city);           //local variable is called
        System.out.println(this.city);      //class level instance variable is called

        System.out.println(super.city);     //Variables2 instance v is called here. to access we are using super keyword
                                            //to call other class variable, we either req obj of that class or inheritence
        System.out.println(name);
        System.out.println(super.name);       //static varible of parent class can be accessed without classname,
                                              // as it is acquired by child class. when we have same variable name, denote with super

    }

    static String  s1 = "oops";
    public static void main(String[] args) {
        Variables1 v1 = new Variables1();
        System.out.println(s1);

        v1.test1();

    }


}
