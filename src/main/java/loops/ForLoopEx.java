package loops;

public class ForLoopEx {

    public static void main(String[] args) {
        /*
        * A loop stmt allows us to execute a stmt or group of stmts multiple times
        * instead of writing multple syso stms to print 1-100 values, we use loops.
        * choose for loop. when we know no of iterations
        * and mostly used over arrays.
        *
        * Arrays store values of similar dt's
        * Array itself is an obkject on the heap
        *
        * for(initialization,conditon,increment/decrement)
        *
        * first initialization, then check the conditon, if true, prints the value, then return to increemnt/decrement.
        * again the increment/decremented value is assigned to variable and moves to condition & so on...
        *
        *
        * */

        for (int i=1;i<=10;i++){
            System.out.println(i);      //prints 1-10
        }

        System.out.println("???????????");

        for (int k=10; k>=1;k--){
            System.out.println(k);      //prints
        }

        System.out.println("???????????");

        for (int i = 10; 0<i;i--){
            System.out.println(i);
        }

        System.out.println("???????????");

        for (double d=2.2; d < 2.5; d++){
            System.out.println(d);
        }
    }

}
