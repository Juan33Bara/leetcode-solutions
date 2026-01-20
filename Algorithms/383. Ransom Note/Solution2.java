// Solution without using "Hash map"
class Solution2 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // This is the array with the alphabet letters
       
        // Count available letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Spend letters for ransomNote
        for (int i = 0 ; i < ransomNote.length() ; i++){
            int idx = ransomNote.charAt(i) - 'a'; 
            count[idx]--; // Decrement 1 
            if (count[idx] < 0) return false;
        }
        return true;

    }
}

