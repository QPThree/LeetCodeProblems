class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
 
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int k = i + 1; k < nums.length; k++){
                if (nums[k] + nums[i] == target){
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return result;
    };

   
    
}