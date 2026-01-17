// Solution without using "Hash map"
class Solution1 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26]; // This is the array with the alphabet letters
        int accumulator = 0;
        // Here we full the array counter with the letters of ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            counter[ransomNote.charAt(i) - 'a'] += 1;
        }

        // With this loop, we discount the array counter based in the letter of magazine 
        for (int i = 0; i < magazine.length(); i++) {
            if (counter[magazine.charAt(i) - 'a'] == 0) {
                continue;
            } else {
                counter[magazine.charAt(i) - 'a'] -= 1;
            }

        }

        // Iterate the counter array using a for each loop
        for (int num : counter) {
            accumulator += num;
        }
        return accumulator == 0; // This return T or F

    }
}
