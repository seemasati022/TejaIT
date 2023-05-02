package oops.interfces;
//@FunctionalInterface      //when declared, exactly only 1 abstract method has to be declared.
public interface Phonepe {      //main piuropose - to achive multiple inheritence i.e 1child-2parent,
                                //loose coupling
                                //here we cant reduce the accessibity of methods/variables
                //choose interface, when we dont have relation betweeen classs

    int i =49;          //by default, variables in Interface -> public static final
    public final int j =20;     //whether we specify it or not, it takes in p,s,f for variables
    public abstract void Busbooking();      //method declaration. this doesnt contain method body & implementation
                                            //bydefault, all the methods in interface are public abstract

                            //we cant create Object, Constructor, static block, instance block for interface

                            //we can also have implemented methods in Interface but only with default meth.
                            // any meth of Interface will be overridden in child class

                           //we can also have a main method in Interface. but cant create object for Interface
    default int TicketNum(int ticket){
        return ticket;
    }

}
