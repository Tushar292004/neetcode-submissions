class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans =  new int[nums.length];
        int current = 1;
        for( int i = 0; i < ans.length; i++){
            ans[i] = current;
            current = nums[i] * current;
        }
        current = 1;
        for( int i = nums.length-1; i >= 0;i--){
            ans[i] = ans[i]*current;
            current = nums[i]*current;
        }

        return ans;
    }
}  
