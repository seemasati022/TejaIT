package excepti;

public class ExceptioneEx2 {

    public void blocks(){

        try {
            System.out.println("try block");
            int i = 101;
            int j = i / 0;           //exception raises here. we need to handle
            System.out.println(j);      //even this stmt also doesnt print

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("arrayindex");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("arithmetic");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("exception");        //this can handle any exception if above catch blocks failed. this is parent
        }/* catch (RuntimeException e){
            System.out.println("runtime");      child exeception cant be defined after parent exeception.
        }*/finally {
            System.out.println("finally block");        //this will get executed even if exeception is raised or not.
                                                        //but this has to be followeed by try/catch. cant be created alone
                                                        //only 1 finally for 1 try
        }
    }

    public static void main(String[] args) {
        ExceptioneEx2 ex2 = new ExceptioneEx2();
        ex2.blocks();
    }
}
