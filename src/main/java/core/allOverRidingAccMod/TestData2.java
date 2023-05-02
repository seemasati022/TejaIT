package core.allOverRidingAccMod;

public class TestData2 {            //parent

    public static void newHouse(){
        System.out.println("parent class - TestData2 -STATIC - newHouse method");
    }
    public void gold(){
        System.out.println("parent class - TestData2 - gold method");
    }

    public void bike(){
        System.out.println("parent class -TestData2 - bike method");
    }

    public void land(){
        System.out.println("parent class - TestData2 - land method");
    }

    private void locker(){
        System.out.println("parent class - TestData2 - private - locker method");
    }

    public final void money(){
        System.out.println("parent class - TestData2 - final - money method");
    }

    public int add(int i, int j){
        return i+j;
    }
}
