package loops;

public class DoWhileEx {
    public static void main(String[] args) {

        /*
        * when we need to print atleast 1 stmnt before checking the condition, we go for do-while
        * */

        int  i = 0;                         //initilization
        do {
            System.out.println(i);          //print
            i++;                            //increment/decrement
        }while (i<10);                      //condition
    }

}
