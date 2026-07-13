package src.com.internet;

import java.util.Arrays;
import java.util.stream.Collectors;
/* EPAM example*/
public class PalingramUsingStreams {
    public static void main(String[] args){
        String[] names = {"madam","hello"};
        System.out.println(Arrays.stream(names).filter(name ->isNamePalindrum(name)).collect(Collectors.toSet()));
    }
    public static boolean isNamePalindrum(String name){
        int start = 0;
        int last = name.length()-1;
        while(start <= last){ //main clue
            if(name.charAt(start)!=name.charAt(last)){
                return false;
            }
            start++;
            last--;

        }
        return true;
    }
}
