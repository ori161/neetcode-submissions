class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int targetVal = target - nums[i];
            if(m.containsKey(targetVal)){
                int j = m.get(targetVal);
                return j < i ? new int[]{j, i} : new int[]{i, j};
            }
            else{
                m.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
