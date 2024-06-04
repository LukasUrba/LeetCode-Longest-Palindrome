import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        int counter = s.length();

        HashMap<Character,Integer> letters = new HashMap<Character,Integer>();

//        Add all letters and count into the hashmap
        for(int i = 0;i<s.length();i++) {
            letters.merge(s.charAt(i), 1 ,Integer::sum);
        }

//        if(s.length()%2==0) {
//            for(Integer i: letters.values()) {
//                if(i%2!=0) {
//                    counter--;
//                }
//            }
//        } else {
//            for(Integer i: letters.values()) {
//
//            }
//        }

        boolean uneven = false;

        for(Integer i: letters.values()) {

            if(i%2!=0) {
                counter--;
            }
        }
        System.out.println(letters);

        return counter;

    }
}