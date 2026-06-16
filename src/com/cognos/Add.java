package src.com.cognos;
//interface  BB {
//    void substract();
//}
@FunctionalInterface
public interface Add {// extends BB{
    //@TODO  FunctionalInterface cannot extened anotehr interface
    //@TODO Fuctional inetface cnnot be a sealed

     int add(int a, int b);
//     default void display(){
//         System.out.println("This is a default method in Add interface");
//     }
}
