package arryas;

import java.util.Arrays;

public class ArrayTest1 {


    int i =2;       //this i stores only 1 value i.e 2

         //this j can accomodate 6 values. this array length is 6 & size is 5. array index starts with 0


    public static void main(String[] args) {
        int[] j = new int[6];       //length = 6, size = len-1 i.e 5
        j[0] = 11;
        j[1] = 22;
        j[2] = 33;
        j[3] = 32;
        j[4] = 44;
        j[5] = 55;
        System.out.println(j[0]);
        System.out.println(j[2]);
        System.out.println(j[4]);
        System.out.println(j.length);


        String[] s1 = new String[3];
        s1[0] = "seema";
        s1[1] = "rhea";
        s1[2] = "geroge";

        System.out.println(s1[2]);
        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println("/////////////////");

        Integer[] i = new Integer[4];
        i[0] =100;
        i[3] = 300;
        System.out.println(i[1]);
        System.out.println(i[0]);
    }
}
