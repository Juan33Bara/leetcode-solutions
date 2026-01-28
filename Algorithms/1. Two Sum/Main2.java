// HashMap solution
public class Main2 {
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        int[] array = {3,2,4};
        int target = 6;
        int[] result = sol2.twoSum(array, target);
        for (int num : result){
            System.out.println(num);
        }
    }
    
}
