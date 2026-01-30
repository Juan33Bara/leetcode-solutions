// This solution returns the reversed character array in place.
class Solution {
    public char[] reverseString(char[] s) {
        int idx1 = 0; // auxiliar variable. Beginning of the array
        int idx2 = s.length-1; // auxiliar variable. End of the array
        char aux; // Intermediate variable to swap values
        while (idx1 < idx2){
            aux = s[idx1];
            s[idx1] = s[idx2];
            s[idx2] = aux;
            idx1++;
            idx2--;
        }
        return s;
    }
}