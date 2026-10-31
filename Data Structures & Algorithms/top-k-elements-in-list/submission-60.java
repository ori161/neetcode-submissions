class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int m = nums.length;
        ArrayList<Integer>[]buckets = new ArrayList[m];
        Map<Integer, Integer>sumHash = new HashMap<>();
        for(int i = 0; i < m; i++){
            buckets[i] = new ArrayList<>();
            sumHash.merge(nums[i], 1, Integer::sum);
        }        
        for(Map.Entry<Integer, Integer>entry : sumHash.entrySet()){
            buckets[entry.getValue() - 1].add(entry.getKey());
        }
        int[]res = new int[k];
        int toK = 0;
        for(int i = m - 1; i >= 0; i--){
            for(int n: buckets[i]){
                res[toK++] = n;
            }
            if(k == toK){
                return res;
            }
        }
        return res;
    }
}
