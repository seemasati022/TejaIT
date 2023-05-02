package oops.inheritence.overriding;

public class GrandPArent{
    public void land(){
        System.out.println("Grandparent land");
    }
    public void gold(){
        System.out.println("grandparent gold");
    }

    public void house(){
        System.out.println("grandparent house");
    }

    public static void main(String[] args) {
        GrandPArent gp = new GrandPArent();
        gp.gold();
        gp.land();
        gp.house();

        System.out.println("======================");
        Parent p = new Parent();        //just like other classes, we can create obj of parent class
                                        // here and call the method but gp cant directly access it.
        p.bike();
        p.house();
    }
}
