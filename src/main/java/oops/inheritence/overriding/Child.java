package oops.inheritence.overriding;

public class Child extends Parent {
    //Inheritence relation using extends keyword.    single-level
    @Override    //this annotation makes sure, this meth is overridden from parent class
    public void gold(){
        System.out.println("Child gold");
        //if no data found after overriding, nothing will be printed
    }

    public void car(){
        System.out.println("Child car");
    }

    public static void main(String[] args) {
        Child c = new Child();
        //child acquires all the props from parent
        //when child overrides any parent meth, then that overridden meth is called
        //child can either use parent or grandparent meth.   //multi level inheritence
        c.gold();
        c.bike();
        c.car();
        c.land();
        c.house();
        GrandPArent gp =new Child();            // we can create obj of any related or non related class in any class
        //Child ch = (Child) new Parent(); sub class ref sup class obj not possible, downcasted
        //Parent p = new Child();
        //p.house();
    }
}
