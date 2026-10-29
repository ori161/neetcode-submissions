class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>gAnagrams = new HashMap<>();
        for(String s: strs){
            int[]m = new int[26];
            for(int i = 0; i < s.length(); i++){
                m[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(m);
            gAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }    
        return new ArrayList(gAnagrams.values());
    }
}
