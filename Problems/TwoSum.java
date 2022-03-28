class Solution {
    public int[] twoSum(int[] nums, int target) {
        
 
        int[] result = new int[2];
        int i = 0;
        for (int num : nums) {
             int k = i + 1;
            for (int x : nums) {
                if ((x + num == target) && (i != k)) {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
                k++;
            }
           
            i++;
        }
        return result;
    }
    
}