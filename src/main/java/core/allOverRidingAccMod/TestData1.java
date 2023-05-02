package core.allOverRidingAccMod;

public class TestData1 extends TestData2 {        //child     //inheritence


    //@Override         is not applicable to static methods
    public static void newHouse(){
        System.out.println("child class - TestData1 - newHouse method");
    }

    @Override   //even if this annotation is not provided, override is happening
    public void gold(){
        System.out.println("Child class - TestData1 - gold method");
    }

    public void bike(){
        System.out.println("child class -TestData1 - bike method");
    }

   /* @Override     even private methods cant be overridden & cant access.
                    if we call this method, this class locker is only called.
    private void locker(){
        System.out.println("child class - TestData1 - locker method");
    }*/

    /*public final void money(){            even final method cant be overridden by child. but can access
        System.out.println("parent class - TestData2 - final - money method");
    }*/

    @Override           //parent class add method is overridden, child can change the functionality but not meth signature
    public int add(int i, int j){
        return i*j;
    }

    public static void main(String[] args) {
        newHouse(); //calling static method. even without class name.
        TestData2.newHouse();       //calling static method of parent class but this cant be overridden by child
        TestData1 td1 = new TestData1();
        td1.gold();     //calls current class gold method
        td1.bike();     //calls current class bike method
        td1.land();     //calls parent class land method
        //td1.locker();   parent class locker() is not callede bcz it is pvt and cant be accessed only in parent class
        td1.money();    //child cant override but can access the final method
        System.out.println(td1.add(20,20));
    }


}
