import java.util.*;

public class Searching {
    private static int search(ArrayList<String> haystack, String needle) {
        for(int i = 0; i < haystack.size(); i++) {
            if (haystack.get(i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(ArrayList<String> haystack, String needle) {
        boolean done = false;
        int start = 0;
        int end = haystack.size() - 1;
        int add = 0;
        int current;
    
        while(!done && (end - start) >= 2){
            current = ((end - start) / 2) + add;
            if (haystack.get(current).equals(needle)) {
                done = true;
                return current;
            }
            else {
                if (number(needle.substring(0, 1)) < number(haystack.get(current).substring(0, 1))) {
                    end = current;
                }
                else {
                    start = current;
                    add = current;
                }
            }
            
        }
        return -1;
    }

    private static int number(String letter) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i = 0; i < alphabet.length; i++) {
            if (letter.equals(alphabet[i])) {
                return i;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        ArrayList<String> haystack = new ArrayList<String>(Arrays.asList("apple", "banana", "banana", "cherry", "lemon", "lime", 
                                    "mango", "orange", "pear", "strawberry", "watermelon"));
        String needle1 = "blueberry";
        String needle2 = "pear";
        String needle3 = "cherry";

        System.out.println(search(haystack, needle1));
        System.out.println(search(haystack, needle2));
        System.out.println(search(haystack, needle3));

        System.out.println(binarySearch(haystack, needle1));
        System.out.println(binarySearch(haystack, needle2));
        System.out.println(binarySearch(haystack, needle3));
    }
}