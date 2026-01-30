public class Mian{
    public static void main(String[] args) {
        char[] s = new char[]{'A','B','C','D'};
        Solution sol = new Solution();
        char[] result = sol.reverseString(s);
        for (Character elem : result) {
            System.out.println(elem);
            
        }
    }
}