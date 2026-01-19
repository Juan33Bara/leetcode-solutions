
class Main3 {

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Solution3 solu = new Solution3(); // Invoking the constructor 
        String ransomNote = "aa";
        String magazine = "ab";
        boolean result = solu.canConstruct(ransomNote, magazine);
        System.out.println("The result is " + result);
    }

} 