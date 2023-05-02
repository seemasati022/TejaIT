package oops.inheritence.overriding;

public class Parent extends GrandPArent {

    @Override
    public void gold(){
        System.out.println("Parent gold");
    }

    public void bike(){
        System.out.println("parent bike");
    }

    @Override
    public void house(){
        System.out.println("gp house acquired by parent");
    }

    public static void main(String[] args) {
        Parent p = new Parent();     //Parent p; val = null, object reference default val. without new keywrd, obj isnt created.
        p.bike();
        p.gold();           //since gold is already overridden in parent, grandparent gold is not taken
                            //parent cant acquire any prop from child. once relation is created, p cant extend c.
        p.house();
        p.land();
    }
}
