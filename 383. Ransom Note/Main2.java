
class Main2 {

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Solution2 solu = new Solution2(); // Invoking the constructor 
        String ransomNote = "aa";
        String magazine = "aba";
        boolean result = solu.canConstruct(ransomNote, magazine);
        System.out.println("The result is " + result);
    }

} 