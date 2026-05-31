package src.com.java16;

import java.util.ArrayList;
import java.util.List;

record Employee(List<String> employeeList){

}

record EmployeeImmutable(List<String> employeeList){

    public EmployeeImmutable{
        employeeList = List.copyOf(employeeList); // Create an immutable copy of the list
    }
}

public class RecordExample {
    public static void main(String[] args){
       List<String> empList =new ArrayList<>();
        Employee employee = new Employee(empList);
        System.out.println( employee.employeeList());
        employee.employeeList().add("Smith"); // This will throw UnsupportedOperationException because List.of creates an immutable list
        System.out.println( employee.employeeList());

        EmployeeImmutable employeeImmutable = new EmployeeImmutable(empList);
        System.out.println(employeeImmutable.employeeList());
        employeeImmutable.employeeList().add("Smith"); // This will throw UnsupportedOperationException because List.copyOf creates an immutable copy of the list
        System.out.println(employeeImmutable.employeeList());
    }
}
