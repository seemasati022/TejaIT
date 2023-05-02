package excepti;

public class ExceptionEx1 {
    /*
     *   Exception -> which breaks the normal flow of the code
     *   we need to handle the exception using try/catch or throws or throw new
     *   Parent of Exception is Throwable
     *
     *   2 types of Exceptions - Runtime Exception & compiletime exxception
     *
     *   RuntimeException is a class and extedns to Exception
     *   we have many subclass in rtexcep. this exception is known after the compilation of the code.
     *
     *   checked/Compiletime exception is not a class and we ge this before executing the code and
     *   prompts to handle the code.
     *   we cant skip this. when an checked exception rises, we either need to handle with try/catch or add throws exceptionclass
     *   to the method signature
     *
     *   try has to be followd by catch/finally{}
     *   catch/finally cant be created own.
     *   we can write try inside try{}
     * */
    public void arithmetic(){
        System.out.println("arithmetic starts");
        try {
            int i = 100;
            int j = i / 0;
            System.out.println(j);

        }
        catch (ArithmeticException e){
            e.printStackTrace();    //this printstacktrace method prints the actual error why & where it has caused
                                    //if we handle the exception and dont call this method, exception is not shown.
        }catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println(i);  accessible to try {} only
        System.out.println("arithemetic ends");

    }

    public void arrayindex(){
        System.out.println("array starts");

        try {

            int[] i = {1, 4, 7, 8, 90, 23};
            System.out.println(i.length);
            System.out.println(i[4]);
            System.out.println(i[7]);   //after this line execution, exception raised and remaining code is not executed. so handle code
                                        //even after handling, code after this inside the try block dont execute.
                                        // but code after catch block gets executed
            try {
                System.out.println("in between");
                System.out.println(i[0]);
                System.out.println(i[6]); //this try gets executed only when 1st try execution is completed without enetering it catch block.
                                            //if execution breaks at 1st try, it doesnt enter 2nd try.
            }catch (Exception e){
                e.printStackTrace();
            }


        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("array ends");
    }

    public void nullPointer() {
        System.out.println("nullpointer start");
        try {
            int i = 20;
            Integer j = 10;
            System.out.println(i + j);            //this return value
            Integer k = null;
            System.out.println(i + k);            //this gives nullpointerexceotion.
                                                    //additon or any math operation with n ull, results in nullpointer exception
/*         try {

        } catch (Exception e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } */
        }catch (NullPointerException e){
            e.printStackTrace();
        }
         catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println("nullpointer ends");         //by handling, this stnmt is also printed
    }


    public void numberFormat(){
        try {

            Integer in = 100;
            Integer integer1 = Integer.valueOf(in);
            System.out.println("interger val "+integer1);

            int i9 =9;
            Float aFloat = Float.valueOf(i9);
            System.out.println("flot val "+aFloat);

            boolean b = false;
            String bs = String.valueOf(b);
            System.out.println("boolean "+bs);

            String s1 = "10";
            System.out.println("String original "+s1);
            int i = Integer.valueOf(s1);                //Interger or int can be assigned
            System.out.println("parsed String "+ i);    //this s1 value is converted to interger and assigned to i

            String s2 = "20s";          //exception is caused due to s2 which contains numb+char which cant be converted to int
            int i2 = Integer.parseInt(s2);              //parseint rt int. Integer can be assigned. codes breaks at 92.
            Integer integer = Integer.valueOf(s2);      //valueof rt integer,int also can be assigned
            System.out.println(i2);
            System.out.println(integer);

        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void interrupted(){
        try {
            Thread.sleep(1000);     //sleep method is throwing exception which is comp[ileTime.
            // we need to handle it when we call the emthod
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExceptionEx1 ex1 = new ExceptionEx1();
        //ex1.arithmetic();
        //ex1.arrayindex();
        ex1.nullPointer();
        ex1.numberFormat();

    }

}
