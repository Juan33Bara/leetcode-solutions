public class Main1 {
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        int[] array = {3,2,4};
        int target = 6;
        int[] result = sol1.twoSum(array, target);
        for (int num : result){
            System.out.println(num);
        }
    }
    
}
