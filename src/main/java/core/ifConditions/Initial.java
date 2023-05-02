package core.ifConditions;

public class Initial {

    int a;          //declaration

    public static void main(String[] args) {

        int a;          //declaration
        a=30;           //iniitialization
        a=31;           //re-initialization

        Initial initial = new Initial();
        initial.a=20;                   //initialization.    for intance variable, initialization alone cant be done in instance level
        initial.a=50;                   //re-initialization

        System.out.println(initial.a);  // class level a
        System.out.println(a);          //local variable a
    }
}
