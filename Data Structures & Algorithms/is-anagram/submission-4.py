class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hash_map1 = {}
        hash_map2 = {}
        for i in range(len(s)):
            hash_map1[s[i]] = 1 + hash_map1.get(s[i],0)
            hash_map2[t[i]] = 1 + hash_map2.get(t[i],0)

        return hash_map2 == hash_map1
