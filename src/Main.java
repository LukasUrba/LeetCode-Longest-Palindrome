import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        int counter = s.length();

//        Keeping explicit assignments in creation of the hashmap speeds it up
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();

//        Add all letters and count into the hashmap
        for (int i = 0; i < s.length(); i++) {
            letters.merge(s.charAt(i), 1, Integer::sum);
        }

//        Allows for 1 character to be not divisible by 2 in case of odd length palindrome
        boolean exceptionReached = false;

        for (Integer i : letters.values()) {

//            Checks that all instances of character are even except for a single instance of exception
            if (i % 2 != 0 && !exceptionReached) {
                exceptionReached = true;
            } else if (i % 2 != 0) {
                counter--;
            }
        }

        return counter;
    }
}