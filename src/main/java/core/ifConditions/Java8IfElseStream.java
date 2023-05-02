package core.ifConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8IfElseStream {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,7,9,11,12,16,17);
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        integerList.stream().forEach(i ->
        {
            if (i % 2 == 0) {
                evenList.add(i);
            } else if (i % 2 != 0) {
                oddList.add(i);
            }
        });
        System.out.println("even numberlist " +evenList );
        System.out.println("odd numberlist " +oddList );

    }
}
