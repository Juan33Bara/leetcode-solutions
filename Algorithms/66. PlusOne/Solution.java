import java.math.BigInteger;

class Solution1 {
    public int[] plusOne(int[] digits) {

        String numberAsString = "";
        for (int i = 0; i < digits.length; i++) {
            numberAsString += String.valueOf(digits[i]); // This converts each digit to a string and appends it
        }

        
        BigInteger number = new BigInteger(numberAsString); // Convert the string to a BigInteger
        number = number.add(BigInteger.ONE); // Add one to the number

        String newNumberAsString = number.toString(); // Convert the new number back to a string

        int[] digitFinal = new int[newNumberAsString.length()]; // Create an array to hold the final digits
        for (int i = 0; i < newNumberAsString.length(); i++) { // Convert each character back to an integer and store it in the array
            digitFinal[i] = Character.getNumericValue(newNumberAsString.charAt(i));
        }

        return digitFinal;
    }
}
