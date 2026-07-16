package src.com.datastructures.tree;

import java.util.HashMap;
import java.util.Map;

class Employee {

    private int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1;           // Same hash code for every object
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Employee))
            return false;

        Employee other = (Employee) obj;

        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Employee " + id;
    }
}

public class HashMapSameBucket {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();

        map.put(new Employee(1), "A");
        map.put(new Employee(2), "B");
        map.put(new Employee(3), "C");
        map.put(new Employee(4), "D");
        map.put(new Employee(5), "E");

        System.out.println(map);
    }
}
