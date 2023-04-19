package org.example;

public class MethodTypesExm {

    public int noArgs(){
        System.out.println("no args methods");
        return 0;       //to this value, we need a println stmt when calling this mnethod
    }

    String login(String firstName,int last4digits ){
        return "UserName of your account " + firstName+last4digits ;
    }

    public double amount(int ticketPrice,double gst,double serviceTax){
        //double totalCost =
                return ticketPrice + gst + serviceTax;

    }


    public static void main(String[] args) {
        MethodTypesExm mte = new MethodTypesExm();
        System.out.println(mte.noArgs());

        System.out.println(mte.login("Seema",8128));

        System.out.println(mte.amount(180,30.99,20.99));
    }
}
