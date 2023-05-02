package excepti;

public class StackOverFloeErrorEx {

    public void m1(){
        System.out.println("m1 meth");
        m2();
    }

    public void m2(){
        System.out.println("m2 meth");
        m3(); //untill here no erro
    }

    public void m3(){
        System.out.println("m3 meth");
        m1();           //recurrsion starts &memory overflow issue -> stackoverflow.-> virtualmachineerror - > error -> throable
    }


    public static void main(String[] args) {
        StackOverFloeErrorEx sofe = new StackOverFloeErrorEx();
        sofe.m1();
        //sofe.m2();
       // sofe.m3();
    }
}
