class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null){
            return 0;
        }
        Set<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        int resMax = 1;
        for(int n : nums){
            if(!(set.contains(n - 1))){
                int maxSeq = 1;
                int iterate = n + 1;
            
                while(set.contains(iterate)){
                    maxSeq++;
                    iterate++;
                }
                if(maxSeq == set.size()){
                    return maxSeq;
                }
                if(maxSeq > resMax){
                    resMax = maxSeq;
                }
            }
        }   
        return resMax;
    }
}
