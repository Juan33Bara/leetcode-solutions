// Solution using HashMap to count character frequencies
// Very similar to Solution2 but uses HashMap instead of array, but the logic is practically the same.
import java.util.HashMap; // Import HashMap from java.util package.
import java.util.Map; // Import Map interface from java.util package.

class Solution3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freq = new HashMap<>(); // Example 'a' --> 3, 'b' --> 5, etc. 

        // 1) Count each character in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i); // Get character at index i
            // The method put() inserts key-value pair into the map. If key already exists, it updates the value.
            // The method getOrDefault() returns the value for the specified key, or a default value if the key is not found.
            freq.put(c, freq.getOrDefault(c, 0) + 1); // Plus one occurrence of character c
        }

        // 2) Consume characters needed by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int available = freq.getOrDefault(c, 0); // Get the value for key c, or 0 if not found

            if (available == 0) return false; // not enough of that character

            freq.put(c, available - 1); // spend one only if available > 0
        }

        return true;
    }
}
