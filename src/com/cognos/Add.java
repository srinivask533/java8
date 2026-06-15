package src.com.cognos;

@FunctionalInterface
public interface Add {
     int add(int a, int b);
     default void display(){
         System.out.println("This is a default method in Add interface");
     }
}
