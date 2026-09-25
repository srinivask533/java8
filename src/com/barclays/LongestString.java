package src.com.barclays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
//        String s ="abcdabcbb";
//        s = "dvdf";
//        char[] chars = s.toCharArray();
//        Map<Character,Integer> charMap = new HashMap();
//        Map<String,Integer> lengthString = new HashMap();
//        int randomNumber = 0;
//        String lenthString = "";
//        for(int i=0;i< chars.length;i++){
//                if(charMap.containsKey(chars[i])){
//                    charMap.clear();
//                    lengthString.put(lenthString,1);
//                    lenthString = "";
//                }else{
//                    lenthString = lenthString+chars[i];
//                    charMap.put(chars[i],0);
//                }
//        }
//        System.out.println(charMap);
//        System.out.println(lengthString);
        aiGeneratedCode();
        pringlongString();
    }
public static void pringlongString(){
    String s = "abcdabcbb";

    Map<Character, Integer> map = new HashMap<>();

    int left = 0;
    int maxLength = 0;
    int start = 0;

    for (int right = 0; right < s.length(); right++) {

        char ch = s.charAt(right);

        if (map.containsKey(ch)) {
            left = Math.max(left, map.get(ch) + 1);
        }

        map.put(ch, right);

        // Current window length
        int currentLength = right - left + 1;

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = left;
        }
    }

    String longest = s.substring(start, start + maxLength);

    System.out.println("Longest substring: " + longest);
    System.out.println("Length: " + maxLength);
}

    public static void aiGeneratedCode() {


                String s = "dvdf";

                Map<Character, Integer> map = new HashMap<>();

                int left = 0;
                int maxLength = 0;

                for (int right = 0; right < s.length(); right++) {

                    char ch = s.charAt(right);

                    if (map.containsKey(ch)) {
                        System.out.println("map.get(ch) "+map.get(ch));
                        left = Math.max(left, map.get(ch) + 1);
                        System.out.println("left "+left);
                    }

                    map.put(ch, right);
                    System.out.println(" map " +map);
                    System.out.println("left "+left+" right =============="+right);
                    maxLength = Math.max(maxLength, right - left + 1);
                    System.out.println(" maxLength "+maxLength);
                }

                System.out.println(maxLength);
            }
        }


