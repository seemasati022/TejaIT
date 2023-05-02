package core.methods;

public class PrimitveDT {
    //number dt
    //stored on stack
    byte b;
    short sh;
    int i;
    long l;

    //decimal
    double d;
    float f;
    char c;
    boolean boo;

    //ObjectiveDTS
    Byte B;
    Short S;
    Integer I;
    Long L;
    Double D;
    Float F;
    Character C;
    Boolean BOO;
    //Custom Class
    PrimitveDT P;

    public static void main(String[] args) {
        PrimitveDT pdt = new PrimitveDT();
        System.out.println(pdt.b);
        System.out.println(pdt.sh);
        System.out.println(pdt.i);
        System.out.println(pdt.l);
        System.out.println(pdt.d);
        System.out.println(pdt.f);
        System.out.println(pdt.c);
        System.out.println(pdt.boo);
        System.out.println("--Objective DTs--");
        System.out.println(pdt.B);
        System.out.println(pdt.S);
        System.out.println(pdt.I);
        System.out.println(pdt.L);
        System.out.println(pdt.D);
        System.out.println(pdt.F);
        System.out.println(pdt.C);
        System.out.println(pdt.BOO);
        System.out.println(pdt.P);

    }
}
