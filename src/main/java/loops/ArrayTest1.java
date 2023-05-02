package loops;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] arr = {15,25,29,23,18,11,14,27,19,18,17,11,27,29};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]); ///we need to print manually. and we dont know the length. so instead

        System.out.println("////////////");
        System.out.println("length of array "+ arr.length);

        for (int i = 0; i<arr.length ; i++){
            if (i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print("  " + arr[i]);
            }
            /*
            if i<arr.length condition is true, then it enter into the block to print arr[i],
            and it also executed any print stmsts here in same loop
             */

        }
        System.out.println("///////");

        int  i =0;
        while (i< arr.length ){
            System.out.println(arr[i]);
            i++;
            //break;
        }

    }
}
