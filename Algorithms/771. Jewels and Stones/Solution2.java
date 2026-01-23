// Using HashSet

import java.util.HashSet;

public class Solution2 {
    public int numJewelsInStones(String jewels, String stones){
        HashSet<Character> set = new HashSet<>(); 
        int counter = 0;

        // Iterate over the jewels string to fill the HashSet
        for (int i = 0 ; i < jewels.length() ; i++){
            set.add(jewels.charAt(i));
        }

        // Iterate over the stones string to count jewels
        for (int i = 0 ; i < stones.length() ; i++){
            if (set.contains(stones.charAt(i))){
                counter++;

            }

        }
     
        

        return counter;
    }
    
}
