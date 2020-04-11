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
    public static void main(String[] args) {
        ArrayList<String> haystack = new ArrayList<String>(Arrays.asList("apple", "banana", "banana", "cherry", "lemon", "lime", 
                                    "orange", "pear", "strawberry", "watermelon"));
        String needle1 = "blueberry";
        String needle2 = "pear";

        System.out.println(search(haystack, needle1));
        System.out.println(search(haystack, needle2));
    }
}