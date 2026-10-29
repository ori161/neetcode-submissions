class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>>gAnagrams = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            Map<Character, Integer>m = new HashMap<>(); 
            for(int j = 0; j < strs[i].length(); j++){
                char c = strs[i].charAt(j);
                m.merge(c, 1, Integer::sum);                
            }
            gAnagrams.computeIfAbsent(m, k -> new ArrayList<String>()).add(strs[i]);
        } 
        return new ArrayList(gAnagrams.values());
    }
}
