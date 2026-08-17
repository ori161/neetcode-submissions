class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = defaultdict(list)
        for s in strs:
            c = [0] * 26
            for ch in s:
                c[ord(ch) - ord('a')] += 1
            group[tuple(c)].append(s)
        
        res = []
        for v in group.values():
            res.append(v)
        
        return res