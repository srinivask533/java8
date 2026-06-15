package src.com.java8;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSkip {
    public static void main(String[] args){
        List<EmployeeRecord> employeeList = List.of(new EmployeeRecord("AC", new AddressRecord("123423","NewJersy")),
                new EmployeeRecord("BC", new AddressRecord("1234231","NewJersy1") ));

        employeeList.stream().sorted(Comparator.comparing(EmployeeRecord::name)).skip(0).forEach(System.out::println);

        List<Integer> integerList = List.of(89,-1,87,56,123,-6);
        integerList.stream().sorted().forEach(System.out::println);

        // Example 1: Sum all elements using reduce
        int sum = integerList.stream().reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println("Sum: " + sum);

        // Example 2: Find maximum using reduce
        int max = integerList.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max: " + max);

        // Example 3: Multiply all elements
        int product = integerList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);




    }
}
