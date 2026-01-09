class Solution2{
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length]; 
        int index = 0;
        for (int i = 0 ; i < n ; i++){
            ans[index++] = nums[i]; // index++ increments after assignment
            ans[index++] = nums[i + n]; // index++ increments after assignment
        }
        return ans;      
    }
}