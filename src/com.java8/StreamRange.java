package src.com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRange {
    public static void main(String[] args){
        int[] arry = {1,2,4,5,6,7,9,10};
//        Set<Integer> integerSet = Arrays.stream(arry)
//                .boxed()
//                .collect(Collectors.toSet());
//        List<Integer> missedNumber = IntStream.rangeClosed(1,9)
//                .filter(i->!integerSet.contains(i))
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(missedNumber);


        Set<Integer> intSet = Arrays.stream(arry).boxed().collect(Collectors.toSet());
        List<Integer> missedNum = IntStream.rangeClosed(1,10).boxed().filter(i->!intSet.contains(i)).collect(Collectors.toList());
        System.out.println(missedNum);

    }


}
