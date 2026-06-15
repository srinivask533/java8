package src.com.java8;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSkip {
    public static void main(String[] args){
        List<EmployeeRecord> employeeList = List.of(new EmployeeRecord("AC", new AddressRecord("123423","NewJersy")),
                new EmployeeRecord("BC", new AddressRecord("1234231","NewJersy1") ));

        employeeList.stream().sorted(Comparator.comparing(EmployeeRecord::name)).skip(0).forEach(System.out::println);

        // Example: Employee list in descending order
        System.out.println("Employees in descending order:");
        employeeList.stream().sorted(Comparator.comparing(EmployeeRecord::name).reversed()).forEach(System.out::println);

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

        int sum1 = integerList.stream().reduce(0,(i,j)->i+j);
        System.out.println("Sum1: " + sum1);

        // Example: Find minimum using comparingInt
        int min = integerList.stream().min(Comparator.comparingInt(value -> value)).orElse(Integer.MAX_VALUE);
        System.out.println("Min: " + min);

        // comparingInt() example with employee list
        EmployeeRecord minEmployee = employeeList.stream()
                .min(Comparator.comparingInt(emp -> emp.name().length()))
                .orElse(null);
        System.out.println("Employee with shortest name: " + minEmployee);

         max = integerList.stream().max(Comparator.comparingInt(value -> value)).orElse(Integer.MIN_VALUE);
        System.out.println("max: " + max);
    }
}
