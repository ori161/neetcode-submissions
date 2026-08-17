class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        Set<Integer> rem_dups = new TreeSet<>();
        for(int i = 0; i < n; i ++){
            rem_dups.add(nums[i]);
        }
        int [] arr = new int[rem_dups.size()];
        int c = 0;
        for (int num : rem_dups){
            if(c == rem_dups.size()){
                break;
            }
            arr[c] = num;
            c++;
        }
        int count_seq = 1;
        int count_max_seq = 1;
        boolean in_seq = true;

        for(int i = 0; i < arr.length - 1; i++){
            if (in_seq){
                if(arr[i] + 1 == arr[i + 1]){
                    count_seq++;
                }
                else{
                    in_seq = false;
                }
            }
            if(!in_seq || i == arr.length - 2){
                count_max_seq = count_seq > count_max_seq ? count_seq: count_max_seq;
                in_seq = true;
                count_seq = 1;
            }
        }
        return count_max_seq;

    }
}
