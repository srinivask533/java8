package src.com.dp.creational;

public enum SingleTonWithConstructor {
    SINGLE_TON("Srinivas");
    SingleTonWithConstructor(String name){

    }

    public String getName(){
       return " Object Created ";
    }
}
