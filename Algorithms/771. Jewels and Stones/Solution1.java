
import java.util.HashMap;

class Solution1{
    public int numJewelsInStones(String jewels, String stones) {
        // Define the hashMap data structure
        HashMap<Character, Integer> map = new HashMap<>();
        int counter = 0;
     
        // Iterate through jewels string to fill the hashMap
        for (int i = 0 ; i < jewels.length() ; i++){
            if (!map.containsKey(jewels.charAt(i))){
                map.put(jewels.charAt(i), 0);
            } 
        }

        // Iterate through stones string to count jewels
        for (int j = 0 ; j < stones.length() ; j++){
            char idx = stones.charAt(j); // get the character at index j of stones string
            if (map.containsKey(idx)) {
                map.put(idx , map.get(idx) + 1); // the method put() updates the value if the key already exists
                counter++;
            }
            // If the character is not a jewel, do nothing (there is no needed to add "continue" statement here)
        }


        return counter;
    }

}