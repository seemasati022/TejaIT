package core.methods;

public class MethodTypesExm {

    public int noArgs(){
        System.out.println("no args methods");
        return 0;       //to this value, we need a println stmt when calling this mnethod
    }

    public String login(String firstName,int last4digits ){
        return "UserName of your account " + firstName+last4digits ;
    }

    public double amount(int ticketPrice,double gst,double serviceTax){
        //double totalCost =
        return ticketPrice + gst + serviceTax;
    }

    //instance variable
    String personName;
    String sportEvent;

    //local  variable are name AND SPORT
    public void sport(String name,String sport){
        this.personName = name;
        this.sportEvent = sport;
        System.out.println("this person "+name + " belongs to  "+sport+" event");
    }


    public static void main(String[] args) {
        MethodTypesExm mte = new MethodTypesExm();
        System.out.println(mte.noArgs());

        System.out.println(mte.login("Seema",8128));

        System.out.println(mte.amount(180,30.99,20.99));

        mte.sport("hardik","cricket");
    }
}
