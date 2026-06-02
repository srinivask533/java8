package src.com.java21;

public class SwitchExample {
    public static void main(String[] args){
        int day = 3;
        String dayName =  switch(day) {
            case 1 -> "Monday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
        }
    }

