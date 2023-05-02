package oops.blocs;

public class Blocks {

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    public Blocks(){
        System.out.println("def constructor");
    }
                //it could be any order of creation, but static b>instance b>constructor
    public static void main(String[] args) {
        Blocks b = new Blocks();
    }
}
