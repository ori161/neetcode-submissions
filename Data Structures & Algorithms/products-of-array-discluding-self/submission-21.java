class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null){
            return null;
        }
        int length = nums.length;
        if(length == 1){
            return new int[]{nums[0]};
        }
        int[]prefix = new int[length];
        int[]suffix = new int[length];
        prefix[0] = 1;
        suffix[length - 1] = 1;
        for(int i = 1; i < length; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
            
        }
        int[]res = new int[length];
        for(int i = 0; i < length; i++){
            res[i] = prefix[i] * suffix[i];
        }
        return res;

    }
}  
