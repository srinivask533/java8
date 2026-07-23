package src.com.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
  public static void main(String[] args){
      EmployeeSort employeeSort = new EmployeeSort();
      employeeSort.sortEmployee();

  }
  class EmplComparator  implements Comparator<REmployee> {


      @Override
      public int compare(REmployee o1, REmployee o2) {
          return o1.getName().compareTo(o2.getName());
      }
  }

  public void  sortEmployee(){
      REmployee emp = new REmployee();
      emp.setName("srinivas");
      REmployee emp1 = new REmployee();
      emp1.setName("hdrinivas");
      List<REmployee> list =new ArrayList();
      list.add(emp1);
      list.add(emp);
      list.sort(new EmplComparator());
      list.stream().map(emp2->emp2.getName()).forEach(System.out::println);
  }
}


 class REmployee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String lastName;
}
