
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /* Solution solution = new Solution();
        int[] digits = {9};
        int[] solu = solution.plusOne(digits);

        
        System.out.println(solu[0]);
        System.out.println(solu[1]);
        System.out.println(solu[2]);
        */
        Solution2 solution2 = new Solution2();
        int[] digits = {1,2,3};
        int[] arraySolution = solution2.plusOne(digits);
        System.out.println(arraySolution[0]);
        System.out.println(arraySolution[1]);
        System.out.println(arraySolution[2]);
    }

}
