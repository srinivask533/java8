import java.utiil.*;
public class StreamExample1{
    public static void main(String args[]){
       System.out.println("Hell");
    }

    public void printList(){
        List<String> cityList = List.of("Hyderbad","Banglore","Chennai");
        cityList.stream().foreach(System.out::println);
    }
}