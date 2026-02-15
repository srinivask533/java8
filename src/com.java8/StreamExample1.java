package com.java8;
import java.utiil.*;
import
public class StreamExample1{
    public static void main(String[] args){
       System.out.println("Hell");
    }

    public void printList(){
        List<String> cityList = List.of("Hyderbad","Banglore","Chennai");
        cityList.stream().foreach(System.out::println);

    }
    public List<Employee> buildEmployees(){
        for(int i:100){
            Department department = new Department();
            Employee emp = new Employee();
            
        }
    }
}