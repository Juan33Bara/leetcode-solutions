public class Main {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] nums = {1,2,3,4,5,6};
        int n = 3;
        int[] ans = sol.shuffle(nums, n);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    
}
