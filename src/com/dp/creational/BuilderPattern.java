package src.com.dp.creational;

class Employee {
    private String name;
   private Employee(Builder builder){
        this.name = builder.name;
    }
    public static  class Builder {
        private String name;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }

}
public class BuilderPattern {
    public static void main(String[] args){
        Employee employee = new Employee.Builder().name("dfd").build();

    }
}
