// HashMap solution
public class Main3 {
    public static void main(String[] args) {
        Solution3 sol3 = new Solution3();
        int[] array = {3 , 3};
        int target = 6;
        int[] result = sol3.twoSum(array, target);
        for (int num : result){
            System.out.println(num);
        }
    }
    
}
